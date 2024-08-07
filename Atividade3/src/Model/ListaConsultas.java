
package Model;

import java.util.ArrayList;
import java.util.List;

public class ListaConsultas {
    
    private static final List <Consultas> lista = new ArrayList<>();
    private String[] colunas = {"Nome", "CPF", "Telefone", "Data", "Já era paciente?", "Consulta Realizada?"};

    public ListaConsultas() {
        
    }
    
    public int getColumnCount() {
        return colunas.length;
    }
    
    public static List<Consultas> listar(){
        return lista;
    }
    
    public static int getRowCount(){
        return lista.size();
    }

    public static void addRow(Consultas con){
        lista.add(con);
    }
    
    public static void Remover (int r){
        lista.remove(r);
    }
    
    public Object getValueAt(int linha, int coluna) {
        if (linha >= 0 && linha < getRowCount() && coluna >= 0 && coluna < getColumnCount()) {
            Consultas consulta = lista.get(linha);
            
            switch (coluna) {
                case 0:
                    return consulta.getNome();
                case 1:
                    return consulta.getCpf();
                case 2:
                    return consulta.getTelefone();
                case 3:
                    return consulta.getData();
                case 4:
                    return consulta.getFidelidade();
                case 5:
                    return consulta.getFinalizar();
                    
                    
                default:
                    throw new IndexOutOfBoundsException("Coluna inválida");
            }
        } else {
            throw new IndexOutOfBoundsException("Linha ou coluna inválida");
        }
    }
    
    public void setValueAt(Object value, int linha, int coluna) {
        if (linha >= 0 && linha < getRowCount() && coluna >= 0 && coluna < getColumnCount()) {
            Consultas consulta = lista.get(linha);

            switch (coluna) {
                case 0:
                    consulta.setNome((String) value);
                    break;
                case 1:
                    consulta.setCpf((String) value);
                    break;
                case 2:
                    consulta.setTelefone((String) value);
                    break;
                case 3:
                    consulta.setData((String) value);
                    break;
                case 4:
                    consulta.setFidelidade((String) value);
                    break;
                case 5:
                    consulta.setFinalizar((String) value);
                    break;
                default:
                    throw new IndexOutOfBoundsException("Coluna inválida");
            }
        } else {
            throw new IndexOutOfBoundsException("Linha ou coluna inválida");
        }
    }
    
}
