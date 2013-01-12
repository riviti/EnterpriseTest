package org.riviti.EnterpriseTest.GWT.client;

import com.google.gwt.user.client.rpc.IsSerializable;

public class OrchestraRegistrationDTO implements IsSerializable {

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public boolean isShortNameUsageAllowed() {
        return shortNameUsageAllowed;
    }

    public void setShortNameUsageAllowed(boolean shortNameUsageAllowed) {
        this.shortNameUsageAllowed = shortNameUsageAllowed;
    }

    public int getSofVisitationCount() {
        return sofVisitationCount;
    }

    public void setSofVisitationCount(int sofVisitationCount) {
        this.sofVisitationCount = sofVisitationCount;
    }

    public String getLookingForwardToDescription() {
        return lookingForwardToDescription;
    }

    public void setLookingForwardToDescription(String lookingForwardToDescription) {
        this.lookingForwardToDescription = lookingForwardToDescription;
    }

    public String getFavouriteMusicDescription() {
        return favouriteMusicDescription;
    }

    public void setFavouriteMusicDescription(String favouriteMusicDescription) {
        this.favouriteMusicDescription = favouriteMusicDescription;
    }

    public String getBestOrchestraMemory() {
        return bestOrchestraMemory;
    }

    public void setBestOrchestraMemory(String bestOrchestraMemory) {
        this.bestOrchestraMemory = bestOrchestraMemory;
    }

    public String getConcertRitualDescription() {
        return concertRitualDescription;
    }

    public void setConcertRitualDescription(String concertRitualDescription) {
        this.concertRitualDescription = concertRitualDescription;
    }

    public String getThreeDescriptiveWords() {
        return threeDescriptiveWords;
    }

    public void setThreeDescriptiveWords(String threeDescriptiveWords) {
        this.threeDescriptiveWords = threeDescriptiveWords;
    }

}