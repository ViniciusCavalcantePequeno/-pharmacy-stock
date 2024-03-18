import java.util.ArrayList;
import java.util.List;

public class Record {
  private List<Record> recordPatient;

  public record() {
    recordPatient = new ArrayList<>();
  }

  public List<Record> listarrecords() {
    return recordPatient;
  }

  public void setProdutos(List<Record> records) {
    this.recordPatient = records;
  }

  public void removerrecord(Record record) {
    recordPatient.remove(record);
  }
}