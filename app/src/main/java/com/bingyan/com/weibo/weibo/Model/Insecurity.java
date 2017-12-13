package jsonscn.json2bean;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
/**
 * Auto-generated: 2017-12-12 16:49:27
 *
 * @author www.jsons.cn 
 * @website http://www.jsons.cn/json2java/ 
 */
public class Insecurity {

    @JsonProperty("sexual_content")
    private boolean sexualContent;
    public void setSexualContent(boolean sexualContent) {
         this.sexualContent = sexualContent;
     }
     public boolean getSexualContent() {
         return sexualContent;
     }

}