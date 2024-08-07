
package pacageObs;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TheDe
 */
public class ListaObsevacoes {
    private static final List <Observacoes> lista = new ArrayList<>();
    private String[] colunas = {"Receitas e Observações"};

    public ListaObsevacoes() {
        
    }
    
    public int getColumnCount() {
        return colunas.length;
    }
    
    public static List<Observacoes> listar(){
        return lista;
    }
    
    public static int getRowCount(){
        return lista.size();
    }

    public static void addRow(Observacoes obs){
        lista.add(obs);
    }
    
    public static void Remover (int r){
        lista.remove(r);
    }
    
    public Object getValueAt(int linha, int coluna) {
        if (linha >= 0 && linha < getRowCount() && coluna >= 0 && coluna < getColumnCount()) {
            Observacoes observacoes = lista.get(linha);
            
            switch (coluna) {
                case 0:
                    return observacoes.getObs();
                    
                default:
                    throw new IndexOutOfBoundsException("Coluna inválida");
            }
        } else {
            throw new IndexOutOfBoundsException("Linha ou coluna inválida");
        }
    }
    
    public void setValueAt(Object value, int linha, int coluna) {
        if (linha >= 0 && linha < getRowCount() && coluna >= 0 && coluna < getColumnCount()) {
            Observacoes observacoes = lista.get(linha);

            switch (coluna) {
                case 0:
                    observacoes.setObs((String) value);
                    break;
                default:
                    throw new IndexOutOfBoundsException("Coluna inválida");
            }
        } else {
            throw new IndexOutOfBoundsException("Linha ou coluna inválida");
        }
    }
}
