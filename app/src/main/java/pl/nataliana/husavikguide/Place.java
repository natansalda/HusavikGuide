package pl.nataliana.husavikguide;

public class Place {

    /**
     * Name of the place
     */
    private String mPlaceName;

    /**
     * Desription of the place
     */
    private String mDescriptionPlace;

    /**
     * Image resource ID for the place
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /**
     * Constant value that represents no image was provided for this place
     */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Place object.
     */
    public Place(String placeName, String descriptionPlace, int imageResourceId) {
        mPlaceName = placeName;
        mDescriptionPlace = descriptionPlace;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the name of the place.
     */
    public String getPlaceName() {
        return mPlaceName;
    }

    /**
     * Get the description of the place.
     */
    public String getDescriptionPlace() {
        return mDescriptionPlace;
    }

    /**
     * Return the image resource ID of the word.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}