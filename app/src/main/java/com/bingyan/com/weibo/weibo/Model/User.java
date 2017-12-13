package jsonscn.json2bean;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
/**
 * Auto-generated: 2017-12-12 16:49:27
 *
 * @author www.jsons.cn 
 * @website http://www.jsons.cn/json2java/ 
 */
public class User {

    private int id;
    private String idstr;
    private int class;
    @JsonProperty("screen_name")
    private String screenName;
    private String name;
    private String province;
    private String city;
    private String location;
    private String description;
    private String url;
    @JsonProperty("profile_image_url")
    private String profileImageUrl;
    @JsonProperty("cover_image")
    private String coverImage;
    @JsonProperty("cover_image_phone")
    private String coverImagePhone;
    @JsonProperty("profile_url")
    private String profileUrl;
    private String domain;
    private String weihao;
    private String gender;
    @JsonProperty("followers_count")
    private int followersCount;
    @JsonProperty("friends_count")
    private int friendsCount;
    @JsonProperty("pagefriends_count")
    private int pagefriendsCount;
    @JsonProperty("statuses_count")
    private int statusesCount;
    @JsonProperty("favourites_count")
    private int favouritesCount;
    @JsonProperty("created_at")
    private String createdAt;
    private boolean following;
    @JsonProperty("allow_all_act_msg")
    private boolean allowAllActMsg;
    @JsonProperty("geo_enabled")
    private boolean geoEnabled;
    private boolean verified;
    @JsonProperty("verified_type")
    private int verifiedType;
    private String remark;
    private Insecurity insecurity;
    private int ptype;
    @JsonProperty("allow_all_comment")
    private boolean allowAllComment;
    @JsonProperty("avatar_large")
    private String avatarLarge;
    @JsonProperty("avatar_hd")
    private String avatarHd;
    @JsonProperty("verified_reason")
    private String verifiedReason;
    @JsonProperty("verified_trade")
    private String verifiedTrade;
    @JsonProperty("verified_reason_url")
    private String verifiedReasonUrl;
    @JsonProperty("verified_source")
    private String verifiedSource;
    @JsonProperty("verified_source_url")
    private String verifiedSourceUrl;
    @JsonProperty("verified_state")
    private int verifiedState;
    @JsonProperty("verified_level")
    private int verifiedLevel;
    @JsonProperty("verified_type_ext")
    private int verifiedTypeExt;
    @JsonProperty("has_service_tel")
    private boolean hasServiceTel;
    @JsonProperty("verified_reason_modified")
    private String verifiedReasonModified;
    @JsonProperty("verified_contact_name")
    private String verifiedContactName;
    @JsonProperty("verified_contact_email")
    private String verifiedContactEmail;
    @JsonProperty("verified_contact_mobile")
    private String verifiedContactMobile;
    @JsonProperty("follow_me")
    private boolean followMe;
    private boolean like;
    @JsonProperty("like_me")
    private boolean likeMe;
    @JsonProperty("online_status")
    private int onlineStatus;
    @JsonProperty("bi_followers_count")
    private int biFollowersCount;
    private String lang;
    private int star;
    private int mbtype;
    private int mbrank;
    @JsonProperty("block_word")
    private int blockWord;
    @JsonProperty("block_app")
    private int blockApp;
    @JsonProperty("credit_score")
    private int creditScore;
    @JsonProperty("user_ability")
    private int userAbility;
    private int urank;
    @JsonProperty("story_read_state")
    private int storyReadState;
    @JsonProperty("vclub_member")
    private int vclubMember;
    public void setId(int id) {
         this.id = id;
     }
     public int getId() {
         return id;
     }

    public void setIdstr(String idstr) {
         this.idstr = idstr;
     }
     public String getIdstr() {
         return idstr;
     }

    public void setClass(int class) {
         this.class = class;
     }
     public int getClass() {
         return class;
     }

    public void setScreenName(String screenName) {
         this.screenName = screenName;
     }
     public String getScreenName() {
         return screenName;
     }

    public void setName(String name) {
         this.name = name;
     }
     public String getName() {
         return name;
     }

    public void setProvince(String province) {
         this.province = province;
     }
     public String getProvince() {
         return province;
     }

    public void setCity(String city) {
         this.city = city;
     }
     public String getCity() {
         return city;
     }

    public void setLocation(String location) {
         this.location = location;
     }
     public String getLocation() {
         return location;
     }

    public void setDescription(String description) {
         this.description = description;
     }
     public String getDescription() {
         return description;
     }

    public void setUrl(String url) {
         this.url = url;
     }
     public String getUrl() {
         return url;
     }

    public void setProfileImageUrl(String profileImageUrl) {
         this.profileImageUrl = profileImageUrl;
     }
     public String getProfileImageUrl() {
         return profileImageUrl;
     }

    public void setCoverImage(String coverImage) {
         this.coverImage = coverImage;
     }
     public String getCoverImage() {
         return coverImage;
     }

    public void setCoverImagePhone(String coverImagePhone) {
         this.coverImagePhone = coverImagePhone;
     }
     public String getCoverImagePhone() {
         return coverImagePhone;
     }

    public void setProfileUrl(String profileUrl) {
         this.profileUrl = profileUrl;
     }
     public String getProfileUrl() {
         return profileUrl;
     }

    public void setDomain(String domain) {
         this.domain = domain;
     }
     public String getDomain() {
         return domain;
     }

    public void setWeihao(String weihao) {
         this.weihao = weihao;
     }
     public String getWeihao() {
         return weihao;
     }

    public void setGender(String gender) {
         this.gender = gender;
     }
     public String getGender() {
         return gender;
     }

    public void setFollowersCount(int followersCount) {
         this.followersCount = followersCount;
     }
     public int getFollowersCount() {
         return followersCount;
     }

    public void setFriendsCount(int friendsCount) {
         this.friendsCount = friendsCount;
     }
     public int getFriendsCount() {
         return friendsCount;
     }

    public void setPagefriendsCount(int pagefriendsCount) {
         this.pagefriendsCount = pagefriendsCount;
     }
     public int getPagefriendsCount() {
         return pagefriendsCount;
     }

    public void setStatusesCount(int statusesCount) {
         this.statusesCount = statusesCount;
     }
     public int getStatusesCount() {
         return statusesCount;
     }

    public void setFavouritesCount(int favouritesCount) {
         this.favouritesCount = favouritesCount;
     }
     public int getFavouritesCount() {
         return favouritesCount;
     }

    public void setCreatedAt(String createdAt) {
         this.createdAt = createdAt;
     }
     public String getCreatedAt() {
         return createdAt;
     }

    public void setFollowing(boolean following) {
         this.following = following;
     }
     public boolean getFollowing() {
         return following;
     }

    public void setAllowAllActMsg(boolean allowAllActMsg) {
         this.allowAllActMsg = allowAllActMsg;
     }
     public boolean getAllowAllActMsg() {
         return allowAllActMsg;
     }

    public void setGeoEnabled(boolean geoEnabled) {
         this.geoEnabled = geoEnabled;
     }
     public boolean getGeoEnabled() {
         return geoEnabled;
     }

    public void setVerified(boolean verified) {
         this.verified = verified;
     }
     public boolean getVerified() {
         return verified;
     }

    public void setVerifiedType(int verifiedType) {
         this.verifiedType = verifiedType;
     }
     public int getVerifiedType() {
         return verifiedType;
     }

    public void setRemark(String remark) {
         this.remark = remark;
     }
     public String getRemark() {
         return remark;
     }

    public void setInsecurity(Insecurity insecurity) {
         this.insecurity = insecurity;
     }
     public Insecurity getInsecurity() {
         return insecurity;
     }

    public void setPtype(int ptype) {
         this.ptype = ptype;
     }
     public int getPtype() {
         return ptype;
     }

    public void setAllowAllComment(boolean allowAllComment) {
         this.allowAllComment = allowAllComment;
     }
     public boolean getAllowAllComment() {
         return allowAllComment;
     }

    public void setAvatarLarge(String avatarLarge) {
         this.avatarLarge = avatarLarge;
     }
     public String getAvatarLarge() {
         return avatarLarge;
     }

    public void setAvatarHd(String avatarHd) {
         this.avatarHd = avatarHd;
     }
     public String getAvatarHd() {
         return avatarHd;
     }

    public void setVerifiedReason(String verifiedReason) {
         this.verifiedReason = verifiedReason;
     }
     public String getVerifiedReason() {
         return verifiedReason;
     }

    public void setVerifiedTrade(String verifiedTrade) {
         this.verifiedTrade = verifiedTrade;
     }
     public String getVerifiedTrade() {
         return verifiedTrade;
     }

    public void setVerifiedReasonUrl(String verifiedReasonUrl) {
         this.verifiedReasonUrl = verifiedReasonUrl;
     }
     public String getVerifiedReasonUrl() {
         return verifiedReasonUrl;
     }

    public void setVerifiedSource(String verifiedSource) {
         this.verifiedSource = verifiedSource;
     }
     public String getVerifiedSource() {
         return verifiedSource;
     }

    public void setVerifiedSourceUrl(String verifiedSourceUrl) {
         this.verifiedSourceUrl = verifiedSourceUrl;
     }
     public String getVerifiedSourceUrl() {
         return verifiedSourceUrl;
     }

    public void setVerifiedState(int verifiedState) {
         this.verifiedState = verifiedState;
     }
     public int getVerifiedState() {
         return verifiedState;
     }

    public void setVerifiedLevel(int verifiedLevel) {
         this.verifiedLevel = verifiedLevel;
     }
     public int getVerifiedLevel() {
         return verifiedLevel;
     }

    public void setVerifiedTypeExt(int verifiedTypeExt) {
         this.verifiedTypeExt = verifiedTypeExt;
     }
     public int getVerifiedTypeExt() {
         return verifiedTypeExt;
     }

    public void setHasServiceTel(boolean hasServiceTel) {
         this.hasServiceTel = hasServiceTel;
     }
     public boolean getHasServiceTel() {
         return hasServiceTel;
     }

    public void setVerifiedReasonModified(String verifiedReasonModified) {
         this.verifiedReasonModified = verifiedReasonModified;
     }
     public String getVerifiedReasonModified() {
         return verifiedReasonModified;
     }

    public void setVerifiedContactName(String verifiedContactName) {
         this.verifiedContactName = verifiedContactName;
     }
     public String getVerifiedContactName() {
         return verifiedContactName;
     }

    public void setVerifiedContactEmail(String verifiedContactEmail) {
         this.verifiedContactEmail = verifiedContactEmail;
     }
     public String getVerifiedContactEmail() {
         return verifiedContactEmail;
     }

    public void setVerifiedContactMobile(String verifiedContactMobile) {
         this.verifiedContactMobile = verifiedContactMobile;
     }
     public String getVerifiedContactMobile() {
         return verifiedContactMobile;
     }

    public void setFollowMe(boolean followMe) {
         this.followMe = followMe;
     }
     public boolean getFollowMe() {
         return followMe;
     }

    public void setLike(boolean like) {
         this.like = like;
     }
     public boolean getLike() {
         return like;
     }

    public void setLikeMe(boolean likeMe) {
         this.likeMe = likeMe;
     }
     public boolean getLikeMe() {
         return likeMe;
     }

    public void setOnlineStatus(int onlineStatus) {
         this.onlineStatus = onlineStatus;
     }
     public int getOnlineStatus() {
         return onlineStatus;
     }

    public void setBiFollowersCount(int biFollowersCount) {
         this.biFollowersCount = biFollowersCount;
     }
     public int getBiFollowersCount() {
         return biFollowersCount;
     }

    public void setLang(String lang) {
         this.lang = lang;
     }
     public String getLang() {
         return lang;
     }

    public void setStar(int star) {
         this.star = star;
     }
     public int getStar() {
         return star;
     }

    public void setMbtype(int mbtype) {
         this.mbtype = mbtype;
     }
     public int getMbtype() {
         return mbtype;
     }

    public void setMbrank(int mbrank) {
         this.mbrank = mbrank;
     }
     public int getMbrank() {
         return mbrank;
     }

    public void setBlockWord(int blockWord) {
         this.blockWord = blockWord;
     }
     public int getBlockWord() {
         return blockWord;
     }

    public void setBlockApp(int blockApp) {
         this.blockApp = blockApp;
     }
     public int getBlockApp() {
         return blockApp;
     }

    public void setCreditScore(int creditScore) {
         this.creditScore = creditScore;
     }
     public int getCreditScore() {
         return creditScore;
     }

    public void setUserAbility(int userAbility) {
         this.userAbility = userAbility;
     }
     public int getUserAbility() {
         return userAbility;
     }

    public void setUrank(int urank) {
         this.urank = urank;
     }
     public int getUrank() {
         return urank;
     }

    public void setStoryReadState(int storyReadState) {
         this.storyReadState = storyReadState;
     }
     public int getStoryReadState() {
         return storyReadState;
     }

    public void setVclubMember(int vclubMember) {
         this.vclubMember = vclubMember;
     }
     public int getVclubMember() {
         return vclubMember;
     }

}