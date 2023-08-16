package com.devenzo.neuromarket.model;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Component
@Entity
@Table(name = "brand")
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String brandName;

    private String ownerName;

    private String phone;

    @ManyToMany(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    @JoinTable(name = "brand_influencer", joinColumns = @JoinColumn(name = "b_id"), inverseJoinColumns = @JoinColumn(name = "i_id"))
    private List<Influencer> influencerList;

    public Brand() {
        influencerList = new ArrayList<>();
    }

    public Brand(int id, String brandName, String ownerName, String phone, List<Influencer> influencerList) {
        this();

        this.id = id;
        this.brandName = brandName;
        this.ownerName = ownerName;
        this.phone = phone;
        this.influencerList = influencerList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Influencer> getInfluencerList() {
        return influencerList;
    }

    public void setInfluencerList(List<Influencer> influencerList) {
        this.influencerList = influencerList;
    }
}
