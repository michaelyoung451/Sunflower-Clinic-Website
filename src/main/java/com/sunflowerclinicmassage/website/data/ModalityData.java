package com.sunflowerclinicmassage.website.data;

import com.sunflowerclinicmassage.website.models.Modality;

import java.util.*;

public class ModalityData {

    private static Map<Integer, Modality> modalities = new HashMap<>();

    public static Modality customMassage = new Modality("Customized Massage", "You're body is unique, which is why we use a variety of techniques including Swedish, Deep Tissue, Trigger Point, and Sport Massage.");
    public static Modality prenatalMassage = new Modality("Prenatal Massage", "We utilize state-of-the-art equipment to help relieve stress from expecting mothers, ensuring a smoother, healthier pregnancy.");
    public static Modality cuppingTherapy = new Modality("Cupping Therapy", "Using suction to pull on the muscle tissue, Cupping Therapy provides a more localized treatment, as well as a safer way to treat soft tissue.");
    public static Modality hotStone = new Modality("Hot Stone Therapy", "Heated stones applied to the back help relieve tension in the muscles and make them more receptive to treatment.");
    public static Modality aromatherapy = new Modality("Aromatherapy", "Aromatic essential oils are used medicinally to assist in calming nerves, easing tension, and relieving pain.");
    public static Modality faceMassage = new Modality("Face Massage", "A focused massage for the facial muscles that relieves tension, drains bloating, and provides healthier and more radiant skin.");
    public static Modality footScrub = new Modality("Foot Scrub", "A foot scrub is applied to the feet to help remove and exfoliate the dry, rough areas of your feet.");

    public Map<Integer, Modality> addModalities() {
        modalities.put(0, customMassage);
        modalities.put(1, prenatalMassage);
        modalities.put(2, cuppingTherapy);
        modalities.put(3, hotStone);
        modalities.put(4, aromatherapy);
        modalities.put(5, faceMassage);
        modalities.put(6, footScrub);
        return modalities;
    }

    public static Collection<Modality> getAll() {
        return modalities.values();
    }

}
