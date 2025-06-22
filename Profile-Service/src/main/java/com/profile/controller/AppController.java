package com.profile.controller;

import com.profile.model.ProfileDetails;
import com.profile.repo.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/profile")
public class AppController {

    @Autowired
    private ProfileRepository profileRepository;

    @PostMapping("/add")
    public ProfileDetails addProfileDetails(@RequestBody ProfileDetails profileDetails) {
        return profileRepository.addProfile(profileDetails);

    }

    @PostMapping("/delete")
    public ProfileDetails removeProfileDetails(@RequestBody ProfileDetails profileDetails) {
        return profileRepository.removeProfile(profileDetails);
    }

    @GetMapping
    public List<ProfileDetails> getAllProfileDetails() {
        return profileRepository.getAllProfiles();
    }

}
