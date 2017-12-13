package jsonscn.json2bean;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
/**
 * Auto-generated: 2017-12-12 16:49:27
 *
 * @author www.jsons.cn 
 * @website http://www.jsons.cn/json2java/ 
 */
public class CommentManageInfo {

    @JsonProperty("comment_permission_type")
    private int commentPermissionType;
    @JsonProperty("approval_comment_type")
    private int approvalCommentType;
    public void setCommentPermissionType(int commentPermissionType) {
         this.commentPermissionType = commentPermissionType;
     }
     public int getCommentPermissionType() {
         return commentPermissionType;
     }

    public void setApprovalCommentType(int approvalCommentType) {
         this.approvalCommentType = approvalCommentType;
     }
     public int getApprovalCommentType() {
         return approvalCommentType;
     }

}