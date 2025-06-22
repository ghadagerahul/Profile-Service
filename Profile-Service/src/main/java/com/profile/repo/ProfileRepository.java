package com.profile.repo;

import com.profile.model.ProfileDetails;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProfileRepository {

    List<ProfileDetails> addProfileDetails = new ArrayList<>();

    public ProfileDetails addProfile(ProfileDetails profileDetails) {
        addProfileDetails.add(profileDetails);
        return profileDetails;
    }


    public ProfileDetails removeProfile(ProfileDetails profileDetails) {
        addProfileDetails.remove(profileDetails);
        return profileDetails;
    }

    public List<ProfileDetails> getAllProfiles( ) {
        return addProfileDetails;
    }

}
