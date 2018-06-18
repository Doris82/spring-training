package pl.training.bank.disposition.history;

import lombok.Data;

@Data
public class HistoryEntry {

    private Long id;
    private String accountNumber;
    private long funds;
    private long timestamp;
    private String operationType;

}
