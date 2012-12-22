package org.riviti.EnterpriseTest.Common;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class OrchestraRegistration implements Serializable {
    private static final long serialVersionUID = -2857801871001079471L;

    private int id;
    private String fullName;
    private String shortName;
    private boolean shortNameUsageAllowed;
    private int sofVisitationCount;
    private String lookingForwardToDescription;
    private String favouriteMusicDescription;
    private String bestOrchestraMemory;
    private String concertRitualDescription;
    private String threeDescriptiveWords;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Column
    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    @Column
    public boolean isShortNameUsageAllowed() {
        return shortNameUsageAllowed;
    }

    public void setShortNameUsageAllowed(boolean shortNameUsageAllowed) {
        this.shortNameUsageAllowed = shortNameUsageAllowed;
    }

    @Column
    public int getSofVisitationCount() {
        return sofVisitationCount;
    }

    public void setSofVisitationCount(int sofVisitationCount) {
        this.sofVisitationCount = sofVisitationCount;
    }

    @Column
    public String getLookingForwardToDescription() {
        return lookingForwardToDescription;
    }

    public void setLookingForwardToDescription(String lookingForwardToDescription) {
        this.lookingForwardToDescription = lookingForwardToDescription;
    }

    @Column
    public String getFavouriteMusicDescription() {
        return favouriteMusicDescription;
    }

    public void setFavouriteMusicDescription(String favouriteMusicDescription) {
        this.favouriteMusicDescription = favouriteMusicDescription;
    }

    @Column
    public String getBestOrchestraMemory() {
        return bestOrchestraMemory;
    }

    public void setBestOrchestraMemory(String bestOrchestraMemory) {
        this.bestOrchestraMemory = bestOrchestraMemory;
    }

    @Column
    public String getConcertRitualDescription() {
        return concertRitualDescription;
    }

    public void setConcertRitualDescription(String concertRitualDescription) {
        this.concertRitualDescription = concertRitualDescription;
    }

    @Column
    public String getThreeDescriptiveWords() {
        return threeDescriptiveWords;
    }

    public void setThreeDescriptiveWords(String threeDescriptiveWords) {
        this.threeDescriptiveWords = threeDescriptiveWords;
    }
}
