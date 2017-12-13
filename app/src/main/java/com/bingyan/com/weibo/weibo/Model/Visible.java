package jsonscn.json2bean;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
/**
 * Auto-generated: 2017-12-12 16:49:27
 *
 * @author www.jsons.cn 
 * @website http://www.jsons.cn/json2java/ 
 */
public class Visible {

    private int type;
    @JsonProperty("list_id")
    private int listId;
    public void setType(int type) {
         this.type = type;
     }
     public int getType() {
         return type;
     }

    public void setListId(int listId) {
         this.listId = listId;
     }
     public int getListId() {
         return listId;
     }

}