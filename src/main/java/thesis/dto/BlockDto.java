package thesis.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BlockDto implements Dto{

    private String hash;

    private int confirmations;

    private int size;

    private int height;

    private int version;

    private String merkleroot;

    @JsonProperty("n_tx")
    private int numberOfTransactions;

    private Long time;

    private Long nonce;

    private String  bits;

    private BigDecimal difficulty;

    private String chainwork;

    private Long mediantime;

    @JsonProperty("previousblockhash")
    private String previousBlockHash;

    @JsonProperty("nextblockhash")
    private String nextBlockHash;

    private boolean merged_mined;

    @JsonProperty("tx")
    private List<NMCTransactionDto> transactions;

    private AuxpowDto auxpow;

    private String pow_algo;

    private int pow_alog_id = -1;

    private String pow_hash;

    public BlockDto(String hash) {
        this.hash = hash;
    }

    public BlockDto() {

    }

    public BlockDto(BlockDtoTxFree blockDtoTxFree) {
        this.hash = blockDtoTxFree.getHash();
        this.confirmations = blockDtoTxFree.getConfirmations();
        this.size = blockDtoTxFree.getSize();
        this.height = blockDtoTxFree.getHeight();
        this.version = blockDtoTxFree.getVersion();
        this.merkleroot = blockDtoTxFree.getMerkleroot();
        this.numberOfTransactions = blockDtoTxFree.getNumberOfTransactions();
        this.time = blockDtoTxFree.getTime();
        this.nonce = blockDtoTxFree.getNonce();
        this.bits = blockDtoTxFree.getBits();
        this.difficulty = blockDtoTxFree.getDifficulty();
        this.chainwork = blockDtoTxFree.getChainwork();
        this.mediantime = blockDtoTxFree.getMediantime();
        this.previousBlockHash = blockDtoTxFree.getPreviousBlockHash();
        this.nextBlockHash = blockDtoTxFree.getNextBlockHash();
        this.merged_mined = blockDtoTxFree.isMerged_mined();
        this.auxpow = blockDtoTxFree.getAuxpow();
        this.pow_algo = blockDtoTxFree.getPow_algo();
        this.pow_alog_id = blockDtoTxFree.getPow_alog_id();
        this.pow_hash = blockDtoTxFree.getPow_hash();
        this.transactions = new ArrayList<>();
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public int getConfirmations() {
        return confirmations;
    }

    public void setConfirmations(int confirmations) {
        this.confirmations = confirmations;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getMerkleroot() {
        return merkleroot;
    }

    public void setMerkleroot(String merkleroot) {
        this.merkleroot = merkleroot;
    }

    public int getNumberOfTransactions() {
        return numberOfTransactions;
    }

    public void setNumberOfTransactions(int numberOfTransactions) {
        this.numberOfTransactions = numberOfTransactions;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public Long getNonce() {
        return nonce;
    }

    public void setNonce(Long nonce) {
        this.nonce = nonce;
    }

    public String getBits() {
        return bits;
    }

    public void setBits(String bits) {
        this.bits = bits;
    }

    public BigDecimal getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(BigDecimal difficulty) {
        this.difficulty = difficulty;
    }

    public String getChainwork() {
        return chainwork;
    }

    public void setChainwork(String chainwork) {
        this.chainwork = chainwork;
    }

    public String getPreviousBlockHash() {
        return previousBlockHash;
    }

    public void setPreviousBlockHash(String previousBlockHash) {
        this.previousBlockHash = previousBlockHash;
    }

    public String getNextBlockHash() {
        return nextBlockHash;
    }

    public void setNextBlockHash(String nextBlockHash) {
        this.nextBlockHash = nextBlockHash;
    }

    public List<NMCTransactionDto> getTransactions() {
        return transactions;
    }

    @JsonProperty("tx")
    public void setTransactions(List<NMCTransactionDto> transactions) {
        this.transactions = Arrays.asList(transactions.get(0));
        setNumberOfTransactions(transactions.size());
    }

    public boolean isMerged_mined() {
        return merged_mined;
    }

    public void setMerged_mined(boolean merged_mined) {
        this.merged_mined = merged_mined;
    }

    public Long getMediantime() {
        return mediantime;
    }

    public void setMediantime(Long mediantime) {
        this.mediantime = mediantime;
    }

    public AuxpowDto getAuxpow() {
        return auxpow;
    }

    public void setAuxpow(AuxpowDto auxpow) {
        this.auxpow = auxpow;
    }

    public String getPow_algo() {
        return pow_algo;
    }

    public void setPow_algo(String pow_algo) {
        this.pow_algo = pow_algo;
    }

    public int getPow_alog_id() {
        return pow_alog_id;
    }

    public void setPow_alog_id(int pow_alog_id) {
        this.pow_alog_id = pow_alog_id;
    }

    @JsonProperty("algo")
    private void setPow_alog(int pow_alog_id) {
        this.pow_alog_id = pow_alog_id;
    }

    public String getPow_hash() {
        return pow_hash;
    }

    public void setPow_hash(String pow_hash) {
        this.pow_hash = pow_hash;
    }

}
