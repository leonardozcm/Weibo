package jsonscn.json2bean;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
/**
 * Auto-generated: 2017-12-12 16:49:27
 *
 * @author www.jsons.cn 
 * @website http://www.jsons.cn/json2java/ 
 */
public class PicUrls {

    @JsonProperty("thumbnail_pic")
    private String thumbnailPic;
    public void setThumbnailPic(String thumbnailPic) {
         this.thumbnailPic = thumbnailPic;
     }
     public String getThumbnailPic() {
         return thumbnailPic;
     }

}