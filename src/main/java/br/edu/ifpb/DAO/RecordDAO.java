package DAO;

import java.util.ArrayList;
import java.util.List;

import Objects.Record;

public class RecordDAO {

    private List<Record> stock;

    public RecordDAO() {
        this.stock = new ArrayList<>();
    }

    public void addRecord(Record record) {
        stock.add(Record);
    }

    public Record searchRecordCardSus(int cardSus) {
        for (Record record : stock) {
            if (record.getCardSus() == cardSus) {
                return Record;
            }
        }
        return null;
    }

    public List<Record> listRecords() {
        return stock;
    }

    public void removeRecord(int cardSus) {
        Record record = searchRecordCardSus(cardSus);
        if (record != null) {
            stock.remove(cardSus);
        }
    }

}
