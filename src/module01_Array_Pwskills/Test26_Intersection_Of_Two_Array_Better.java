package module01_Array_Pwskills;

import java.util.*;

class Test_26_Intersection_Of_Array_Better {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();

        // Add all elements of nums1 to the set
        for (int num : nums1) {
            set.add(num);
        }

        // Check if nums2 elements exist in the set
        for (int num : nums2) {
            if (set.contains(num)) {
                set.remove(num); // Remove to ensure uniqueness
                list.add(num);
            }
        }

        // Convert list to int array
        int[] array = list.stream().mapToInt(Integer::intValue).toArray();

        return array;
    }
}
