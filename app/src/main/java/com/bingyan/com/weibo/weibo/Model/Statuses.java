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
public class Statuses {

    @JsonProperty("created_at")
    private String createdAt;
    private int id;
    private String mid;
    private String idstr;
    @JsonProperty("can_edit")
    private boolean canEdit;
    private String text;
    @JsonProperty("source_allowclick")
    private int sourceAllowclick;
    @JsonProperty("source_type")
    private int sourceType;
    private String source;
    private boolean favorited;
    private boolean truncated;
    @JsonProperty("in_reply_to_status_id")
    private String inReplyToStatusId;
    @JsonProperty("in_reply_to_user_id")
    private String inReplyToUserId;
    @JsonProperty("in_reply_to_screen_name")
    private String inReplyToScreenName;
    @JsonProperty("pic_urls")
    private List<String> picUrls;
    private String geo;
    @JsonProperty("is_paid")
    private boolean isPaid;
    @JsonProperty("mblog_vip_type")
    private int mblogVipType;
    private User user;
    @JsonProperty("retweeted_status")
    private RetweetedStatus retweetedStatus;
    @JsonProperty("reposts_count")
    private int repostsCount;
    @JsonProperty("comments_count")
    private int commentsCount;
    @JsonProperty("attitudes_count")
    private int attitudesCount;
    @JsonProperty("pending_approval_count")
    private int pendingApprovalCount;
    @JsonProperty("isLongText")
    private boolean islongtext;
    private int mlevel;
    private Visible visible;
    @JsonProperty("biz_feature")
    private int bizFeature;
    @JsonProperty("hasActionTypeCard")
    private int hasactiontypecard;
    @JsonProperty("darwin_tags")
    private List<String> darwinTags;
    @JsonProperty("hot_weibo_tags")
    private List<String> hotWeiboTags;
    @JsonProperty("text_tag_tips")
    private List<String> textTagTips;
    private String rid;
    @JsonProperty("userType")
    private int usertype;
    @JsonProperty("more_info_type")
    private int moreInfoType;
    @JsonProperty("positive_recom_flag")
    private int positiveRecomFlag;
    @JsonProperty("gif_ids")
    private String gifIds;
    @JsonProperty("is_show_bulletin")
    private int isShowBulletin;
    @JsonProperty("comment_manage_info")
    private CommentManageInfo commentManageInfo;
    public void setCreatedAt(String createdAt) {
         this.createdAt = createdAt;
     }
     public String getCreatedAt() {
         return createdAt;
     }

    public void setId(int id) {
         this.id = id;
     }
     public int getId() {
         return id;
     }

    public void setMid(String mid) {
         this.mid = mid;
     }
     public String getMid() {
         return mid;
     }

    public void setIdstr(String idstr) {
         this.idstr = idstr;
     }
     public String getIdstr() {
         return idstr;
     }

    public void setCanEdit(boolean canEdit) {
         this.canEdit = canEdit;
     }
     public boolean getCanEdit() {
         return canEdit;
     }

    public void setText(String text) {
         this.text = text;
     }
     public String getText() {
         return text;
     }

    public void setSourceAllowclick(int sourceAllowclick) {
         this.sourceAllowclick = sourceAllowclick;
     }
     public int getSourceAllowclick() {
         return sourceAllowclick;
     }

    public void setSourceType(int sourceType) {
         this.sourceType = sourceType;
     }
     public int getSourceType() {
         return sourceType;
     }

    public void setSource(String source) {
         this.source = source;
     }
     public String getSource() {
         return source;
     }

    public void setFavorited(boolean favorited) {
         this.favorited = favorited;
     }
     public boolean getFavorited() {
         return favorited;
     }

    public void setTruncated(boolean truncated) {
         this.truncated = truncated;
     }
     public boolean getTruncated() {
         return truncated;
     }

    public void setInReplyToStatusId(String inReplyToStatusId) {
         this.inReplyToStatusId = inReplyToStatusId;
     }
     public String getInReplyToStatusId() {
         return inReplyToStatusId;
     }

    public void setInReplyToUserId(String inReplyToUserId) {
         this.inReplyToUserId = inReplyToUserId;
     }
     public String getInReplyToUserId() {
         return inReplyToUserId;
     }

    public void setInReplyToScreenName(String inReplyToScreenName) {
         this.inReplyToScreenName = inReplyToScreenName;
     }
     public String getInReplyToScreenName() {
         return inReplyToScreenName;
     }

    public void setPicUrls(List<String> picUrls) {
         this.picUrls = picUrls;
     }
     public List<String> getPicUrls() {
         return picUrls;
     }

    public void setGeo(String geo) {
         this.geo = geo;
     }
     public String getGeo() {
         return geo;
     }

    public void setIsPaid(boolean isPaid) {
         this.isPaid = isPaid;
     }
     public boolean getIsPaid() {
         return isPaid;
     }

    public void setMblogVipType(int mblogVipType) {
         this.mblogVipType = mblogVipType;
     }
     public int getMblogVipType() {
         return mblogVipType;
     }

    public void setUser(User user) {
         this.user = user;
     }
     public User getUser() {
         return user;
     }

    public void setRetweetedStatus(RetweetedStatus retweetedStatus) {
         this.retweetedStatus = retweetedStatus;
     }
     public RetweetedStatus getRetweetedStatus() {
         return retweetedStatus;
     }

    public void setRepostsCount(int repostsCount) {
         this.repostsCount = repostsCount;
     }
     public int getRepostsCount() {
         return repostsCount;
     }

    public void setCommentsCount(int commentsCount) {
         this.commentsCount = commentsCount;
     }
     public int getCommentsCount() {
         return commentsCount;
     }

    public void setAttitudesCount(int attitudesCount) {
         this.attitudesCount = attitudesCount;
     }
     public int getAttitudesCount() {
         return attitudesCount;
     }

    public void setPendingApprovalCount(int pendingApprovalCount) {
         this.pendingApprovalCount = pendingApprovalCount;
     }
     public int getPendingApprovalCount() {
         return pendingApprovalCount;
     }

    public void setIslongtext(boolean islongtext) {
         this.islongtext = islongtext;
     }
     public boolean getIslongtext() {
         return islongtext;
     }

    public void setMlevel(int mlevel) {
         this.mlevel = mlevel;
     }
     public int getMlevel() {
         return mlevel;
     }

    public void setVisible(Visible visible) {
         this.visible = visible;
     }
     public Visible getVisible() {
         return visible;
     }

    public void setBizFeature(int bizFeature) {
         this.bizFeature = bizFeature;
     }
     public int getBizFeature() {
         return bizFeature;
     }

    public void setHasactiontypecard(int hasactiontypecard) {
         this.hasactiontypecard = hasactiontypecard;
     }
     public int getHasactiontypecard() {
         return hasactiontypecard;
     }

    public void setDarwinTags(List<String> darwinTags) {
         this.darwinTags = darwinTags;
     }
     public List<String> getDarwinTags() {
         return darwinTags;
     }

    public void setHotWeiboTags(List<String> hotWeiboTags) {
         this.hotWeiboTags = hotWeiboTags;
     }
     public List<String> getHotWeiboTags() {
         return hotWeiboTags;
     }

    public void setTextTagTips(List<String> textTagTips) {
         this.textTagTips = textTagTips;
     }
     public List<String> getTextTagTips() {
         return textTagTips;
     }

    public void setRid(String rid) {
         this.rid = rid;
     }
     public String getRid() {
         return rid;
     }

    public void setUsertype(int usertype) {
         this.usertype = usertype;
     }
     public int getUsertype() {
         return usertype;
     }

    public void setMoreInfoType(int moreInfoType) {
         this.moreInfoType = moreInfoType;
     }
     public int getMoreInfoType() {
         return moreInfoType;
     }

    public void setPositiveRecomFlag(int positiveRecomFlag) {
         this.positiveRecomFlag = positiveRecomFlag;
     }
     public int getPositiveRecomFlag() {
         return positiveRecomFlag;
     }

    public void setGifIds(String gifIds) {
         this.gifIds = gifIds;
     }
     public String getGifIds() {
         return gifIds;
     }

    public void setIsShowBulletin(int isShowBulletin) {
         this.isShowBulletin = isShowBulletin;
     }
     public int getIsShowBulletin() {
         return isShowBulletin;
     }

    public void setCommentManageInfo(CommentManageInfo commentManageInfo) {
         this.commentManageInfo = commentManageInfo;
     }
     public CommentManageInfo getCommentManageInfo() {
         return commentManageInfo;
     }

}