package model.to.teamdb;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Jay on 2018/1/23.
 *
 * @author Jay
 * @version 1.0
 * @since 1.0
 * Copyright (C) 2017. SinoSoft All Rights Received
 */
@Entity
@Table(name = "NEGATIVE_PUBLIC_OPINION", catalog = "")
public class NegativePublicOpinion {
    private String id;
    private Integer blogScore;
    private Integer forumScore;
    private Integer newsPortalScore;
    private Integer newsletterScore;
    private Integer particularYear;
    private Integer rank;
    private Integer wechatScore;
    private String leadershipOverviewId;
    private Timestamp storeTimeFromEplatform;

    @Id
    @Column(name = "ID", nullable = false, length = 36)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "BLOG_SCORE", nullable = true, precision = 0)
    public Integer getBlogScore() {
        return blogScore;
    }

    public void setBlogScore(Integer blogScore) {
        this.blogScore = blogScore;
    }

    @Basic
    @Column(name = "FORUM_SCORE", nullable = true, precision = 0)
    public Integer getForumScore() {
        return forumScore;
    }

    public void setForumScore(Integer forumScore) {
        this.forumScore = forumScore;
    }

    @Basic
    @Column(name = "NEWS_PORTAL_SCORE", nullable = true, precision = 0)
    public Integer getNewsPortalScore() {
        return newsPortalScore;
    }

    public void setNewsPortalScore(Integer newsPortalScore) {
        this.newsPortalScore = newsPortalScore;
    }

    @Basic
    @Column(name = "NEWSLETTER_SCORE", nullable = true, precision = 0)
    public Integer getNewsletterScore() {
        return newsletterScore;
    }

    public void setNewsletterScore(Integer newsletterScore) {
        this.newsletterScore = newsletterScore;
    }

    @Basic
    @Column(name = "PARTICULAR_YEAR", nullable = true, precision = 0)
    public Integer getParticularYear() {
        return particularYear;
    }

    public void setParticularYear(Integer particularYear) {
        this.particularYear = particularYear;
    }

    @Basic
    @Column(name = "RANK", nullable = true, precision = 0)
    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    @Basic
    @Column(name = "WECHAT_SCORE", nullable = true, precision = 0)
    public Integer getWechatScore() {
        return wechatScore;
    }

    public void setWechatScore(Integer wechatScore) {
        this.wechatScore = wechatScore;
    }

    @Basic
    @Column(name = "LEADERSHIP_OVERVIEW_ID", nullable = true, length = 36)
    public String getLeadershipOverviewId() {
        return leadershipOverviewId;
    }

    public void setLeadershipOverviewId(String leadershipOverviewId) {
        this.leadershipOverviewId = leadershipOverviewId;
    }

    @Basic
    @Column(name = "STORE_TIME_FROM_EPLATFORM", nullable = true)
    public Timestamp getStoreTimeFromEplatform() {
        return storeTimeFromEplatform;
    }

    public void setStoreTimeFromEplatform(Timestamp storeTimeFromEplatform) {
        this.storeTimeFromEplatform = storeTimeFromEplatform;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NegativePublicOpinion that = (NegativePublicOpinion) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (blogScore != null ? !blogScore.equals(that.blogScore) : that.blogScore != null) return false;
        if (forumScore != null ? !forumScore.equals(that.forumScore) : that.forumScore != null) return false;
        if (newsPortalScore != null ? !newsPortalScore.equals(that.newsPortalScore) : that.newsPortalScore != null)
            return false;
        if (newsletterScore != null ? !newsletterScore.equals(that.newsletterScore) : that.newsletterScore != null)
            return false;
        if (particularYear != null ? !particularYear.equals(that.particularYear) : that.particularYear != null)
            return false;
        if (rank != null ? !rank.equals(that.rank) : that.rank != null) return false;
        if (wechatScore != null ? !wechatScore.equals(that.wechatScore) : that.wechatScore != null) return false;
        if (leadershipOverviewId != null ? !leadershipOverviewId.equals(that.leadershipOverviewId) : that.leadershipOverviewId != null)
            return false;
        if (storeTimeFromEplatform != null ? !storeTimeFromEplatform.equals(that.storeTimeFromEplatform) : that.storeTimeFromEplatform != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (blogScore != null ? blogScore.hashCode() : 0);
        result = 31 * result + (forumScore != null ? forumScore.hashCode() : 0);
        result = 31 * result + (newsPortalScore != null ? newsPortalScore.hashCode() : 0);
        result = 31 * result + (newsletterScore != null ? newsletterScore.hashCode() : 0);
        result = 31 * result + (particularYear != null ? particularYear.hashCode() : 0);
        result = 31 * result + (rank != null ? rank.hashCode() : 0);
        result = 31 * result + (wechatScore != null ? wechatScore.hashCode() : 0);
        result = 31 * result + (leadershipOverviewId != null ? leadershipOverviewId.hashCode() : 0);
        result = 31 * result + (storeTimeFromEplatform != null ? storeTimeFromEplatform.hashCode() : 0);
        return result;
    }
}
