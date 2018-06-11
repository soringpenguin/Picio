package com.games.andrewfortner.pocio;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

class Scan {
    public void setImage(String image) {
        this.image = image;
    }

    public void setLabelAnnotations(List<LabelAnnotation> labelAnnotations) {
        this.labelAnnotations = labelAnnotations;
    }

    @SerializedName("image")
    public String image;
    @SerializedName("labelAnnotations")
    public List<LabelAnnotation> labelAnnotations;

    public Scan(String image, List<LabelAnnotation> labelAnnotations) {
        this.image = image;
        this.labelAnnotations = labelAnnotations;
    }

    public String getImage() {
        return image;
    }

    public List<LabelAnnotation> getLabelAnnotations() {
        return labelAnnotations;
    }

    public Scan() {

    }
}

class LabelAnnotation implements Serializable {
    public void setMid(String mid) {
        this.mid = mid;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public void setTopicality(String topicality) {
        this.topicality = topicality;
    }

    @SerializedName("mid")
    public String mid;
    @SerializedName("description")
    public String description;
    @SerializedName("score")
    public String score;
    @SerializedName("topicality")
    public String topicality;

    public LabelAnnotation(String mid, String description, String score, String topicality) {
        this.mid = mid;
        this.description = description;
        this.score = score;
        this.topicality = topicality;
    }

    public String getMid() {
        return mid;
    }

    public String getDescription() {
        return description;
    }

    public String getScore() {
        return score;
    }

    public String getTopicality() {
        return topicality;
    }

    public LabelAnnotation() {

    }
}

class ScanReturn{
    @SerializedName("_id")
    public String _id;
    @SerializedName("image")
    public String image;
    @SerializedName("labelAnnotations")
    public List<LabelAnnotationReturn> labelAnnotations;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<LabelAnnotationReturn> getLabelAnnotations() {
        return labelAnnotations;
    }

    public void setLabelAnnotations(List<LabelAnnotationReturn> labelAnnotations) {
        this.labelAnnotations = labelAnnotations;
    }
}

class LabelAnnotationReturn{
    @SerializedName("_id")
    public String _id;
    @SerializedName("mid")
    public String mid;
    @SerializedName("description")
    public String description;
    @SerializedName("score")
    public String score;
    @SerializedName("topicality")
    public String topicality;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getTopicality() {
        return topicality;
    }

    public void setTopicality(String topicality) {
        this.topicality = topicality;
    }
}