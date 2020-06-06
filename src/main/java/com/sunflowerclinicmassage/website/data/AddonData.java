package com.sunflowerclinicmassage.website.data;

import com.sunflowerclinicmassage.website.models.Addon;
import com.sunflowerclinicmassage.website.models.Modality;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class AddonData {

    private static Map<Integer, Addon> addons = new HashMap<>();

    public static Addon hotStone = new Addon("Hot Stone Therapy", "Heated stones applied to the back help relieve tension in the muscles and make them more receptive to treatment.", "/images/hot-stone.png");
    public static Addon aromatherapy = new Addon("Aromatherapy", "Aromatic essential oils are used medicinally to assist in calming nerves, easing tension, and relieving pain.", "/images/aromatherapy.jpg");
    public static Addon faceMassage = new Addon("Face Massage", "A focused massage for the facial muscles that relieves tension, drains bloating, and provides healthier and more radiant skin.", "/images/Face-massage.jpg");
    public static Addon footScrub = new Addon("Foot Scrub", "A foot scrub is applied to the feet to help remove and exfoliate the dry, rough areas of your feet.", "/images/Foot-Scrub.jpg");

    public Map<Integer, Addon> addAddons() {

        addons.put(0, hotStone);
        addons.put(1, aromatherapy);
        addons.put(2, faceMassage);
        addons.put(3, footScrub);
        return addons;
    }

    public static Collection<Addon> getAll() {
        return addons.values();
    }

}
