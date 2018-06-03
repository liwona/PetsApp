package com.example.android.pets.data;

import android.provider.BaseColumns;

/**
 * Created by Iwona on 03.06.2018.
 */

public class PetContract {

    private PetContract(){}

    public static abstract class PetEntry implements BaseColumns {

        public static final String TABLE_NAME = "pets";

        public static final String _ID = BaseColumns._ID;
        public static final String COLUMN_PET_NAME = "name";
        public static final String COLUMN_PET_BREED = "breed";
        public static final String COLUMN_PET_GENDER = "gender";
        public static final String COLUMN_PET_WEIGHT = "weight";

        /**
         * Possible values for the gender: 0- Unknown, 1-Male, 2-Female
         */
        public static final int GENDER_UNKOWN = 0;
        public static final int GENDER_MALE = 1;
        public static final int GENDER_FEMALE = 2;
    }

}