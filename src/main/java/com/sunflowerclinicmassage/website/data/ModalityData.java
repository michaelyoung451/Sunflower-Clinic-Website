package com.sunflowerclinicmassage.website.data;

import com.sunflowerclinicmassage.website.models.Modality;

import java.util.*;

public class ModalityData {

    private static Map<Integer, Modality> modalities = new HashMap<>();

    public static Modality customMassage = new Modality("Customized Massage", "You're body is unique, which is why we use a variety of techniques including Swedish, Deep Tissue, Trigger Point, and Sport Massage.", "/images/Deep-massage.jpeg");
    public static Modality prenatalMassage = new Modality("Prenatal Massage", "We utilize state-of-the-art equipment to help relieve stress from expecting mothers, ensuring a smoother, healthier pregnancy.", "/images/Prenatal.jpg");
    public static Modality cuppingTherapy = new Modality("Cupping Therapy", "Using suction to pull on the muscle tissue, Cupping Therapy provides a more localized treatment, as well as a safer way to treat soft tissue.", "/images/Cupping.jpg");

    public Map<Integer, Modality> addModalities() {
        modalities.put(0, customMassage);
        modalities.put(1, prenatalMassage);
        modalities.put(2, cuppingTherapy);

        return modalities;
    }

    public static Collection<Modality> getAll() {
        return modalities.values();
    }

}
