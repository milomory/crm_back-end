package net.bonvio.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import net.bonvio.settings.ResponseId;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by mil on 23.11.2015.
 */

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
@Inheritance(strategy= InheritanceType.JOINED)
public class Contact extends ResponseId implements Serializable {

    private Integer id;
    private String shortName;
    private String fullName;
    private String type;
    private String address;
    private String description;

    private List<Phone> phoneList = new ArrayList<>();
    private List<Website> websiteList = new ArrayList<>();
    private List<Email> emailList = new ArrayList<>();
    private List<Social> socialList = new ArrayList<>();
    private List<Tag> tagList = new ArrayList<>();

    @Override
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getShortName() {
        return shortName;
    }
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    @OneToMany (mappedBy = "contact")
    @JsonIgnore
    @Transient
    public List<Phone> getPhoneList() {
        return phoneList;
    }
    public void setPhoneList(List<Phone> phoneList) {
        this.phoneList = phoneList;
    }

    @OneToMany (mappedBy = "contact")
    @JsonIgnore
    @Transient
    public List<Website> getWebsiteList() {
        return websiteList;
    }
    public void setWebsiteList(List<Website> websiteList) {
        this.websiteList = websiteList;
    }

    @OneToMany (mappedBy = "contact")
    @JsonIgnore
    @Transient
    public List<Email> getEmailList() {
        return emailList;
    }
    public void setEmailList(List<Email> emailList) {
        this.emailList = emailList;
    }

    @OneToMany (mappedBy = "contact")
    @JsonIgnore
    @Transient
    public List<Social> getSocialList() {
        return socialList;
    }
    public void setSocialList(List<Social> socialList) {
        this.socialList = socialList;
    }

    @OneToMany (mappedBy = "contact")
    @JsonIgnore
    @Transient
    public List<Tag> getTagList() {
        return tagList;
    }
    public void setTagList(List<Tag> tagList) {
        this.tagList = tagList;
    }

}
