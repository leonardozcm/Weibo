package jsonscn.json2bean;
import java.util.List;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
/**
 * Auto-generated: 2017-12-12 16:49:27
 *
 * @author www.jsons.cn 
 * @website http://www.jsons.cn/json2java/ 
 */
public class JsonsRootBean {

    private List<Statuses> statuses;
    private List<String> advertises;
    private List<String> ad;
    private boolean hasvisible;
    @JsonProperty("previous_cursor")
    private int previousCursor;
    @JsonProperty("next_cursor")
    private int nextCursor;
    @JsonProperty("total_number")
    private int totalNumber;
    private int interval;
    @JsonProperty("uve_blank")
    private int uveBlank;
    @JsonProperty("since_id")
    private int sinceId;
    @JsonProperty("max_id")
    private int maxId;
    @JsonProperty("has_unread")
    private int hasUnread;
    public void setStatuses(List<Statuses> statuses) {
         this.statuses = statuses;
     }
     public List<Statuses> getStatuses() {
         return statuses;
     }

    public void setAdvertises(List<String> advertises) {
         this.advertises = advertises;
     }
     public List<String> getAdvertises() {
         return advertises;
     }

    public void setAd(List<String> ad) {
         this.ad = ad;
     }
     public List<String> getAd() {
         return ad;
     }

    public void setHasvisible(boolean hasvisible) {
         this.hasvisible = hasvisible;
     }
     public boolean getHasvisible() {
         return hasvisible;
     }

    public void setPreviousCursor(int previousCursor) {
         this.previousCursor = previousCursor;
     }
     public int getPreviousCursor() {
         return previousCursor;
     }

    public void setNextCursor(int nextCursor) {
         this.nextCursor = nextCursor;
     }
     public int getNextCursor() {
         return nextCursor;
     }

    public void setTotalNumber(int totalNumber) {
         this.totalNumber = totalNumber;
     }
     public int getTotalNumber() {
         return totalNumber;
     }

    public void setInterval(int interval) {
         this.interval = interval;
     }
     public int getInterval() {
         return interval;
     }

    public void setUveBlank(int uveBlank) {
         this.uveBlank = uveBlank;
     }
     public int getUveBlank() {
         return uveBlank;
     }

    public void setSinceId(int sinceId) {
         this.sinceId = sinceId;
     }
     public int getSinceId() {
         return sinceId;
     }

    public void setMaxId(int maxId) {
         this.maxId = maxId;
     }
     public int getMaxId() {
         return maxId;
     }

    public void setHasUnread(int hasUnread) {
         this.hasUnread = hasUnread;
     }
     public int getHasUnread() {
         return hasUnread;
     }

}