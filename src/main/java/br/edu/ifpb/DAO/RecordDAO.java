package DAO;

import java.util.ArrayList;
import java.util.List;

import Objects.Record;

public class RecordDAO {

    private List<Record> stockRecords;

    public RecordDAO() {
        this.stockRecords = new ArrayList<>();
    }

    public void addRecord(Record record) {
        stockRecords.add(record);
    }

    public Record searchRecordCardSus(int cardSus) {
        for (Record record : stockRecords) {
            if (record.getCardSUS() == cardSus) {
                return record;
            }
        }
        return null;
    }

    public List<Record> listRecords() {
        return stockRecords;
    }

    public void removeRecord(int cardSus) {
        Record record = searchRecordCardSus(cardSus);
        if (record != null) {
            stockRecords.remove(cardSus);
        }
    }

}
