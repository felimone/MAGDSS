package net.manhica.maltem.magdss.model;

/**
 * Created by afelimone on 4/11/2016.
 */
public class Member implements Table {
    private String name;
    private String permid;
    private String relationship;
    private String dob;
    private String memberUuid;
    private String household;
    private String householdUuid;
    //Control variable
    private String uri;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPermid() {
        return permid;
    }

    public void setPermid(String permid) {
        this.permid = permid;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getMemberUuid() {
        return memberUuid;
    }

    public void setMemberUuid(String memberUuid) {
        this.memberUuid = memberUuid;
    }

    public String getHousehold() {
        return household;
    }

    public void setHousehold(String household) {
        this.household = household;
    }

    public String getHouseholdUuid() {
        return householdUuid;
    }

    public void setHouseholdUuid(String householdUuid) {
        this.householdUuid = householdUuid;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }
}
