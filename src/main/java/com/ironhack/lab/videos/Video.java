package com.ironhack.lab.videos;

/**
 * Base type of the streaming catalogue.
 *
 * <p>Every video in the service is either a {@link TvSeries} or a
 * {@link Movie}, so this class is abstract: it holds the state and behaviour
 * both share and cannot be instantiated on its own.</p>
 *
 * <p>{@link #getInfo()} is concrete rather than abstract so the shared fields
 * are formatted in exactly one place; subclasses call {@code super.getInfo()}
 * and append only what they add.</p>
 */
public abstract class Video {

    /** Title of the video. */
    private String title;

    /** Running time of the video, in minutes. */
    private int duration;

    /**
     * Creates a video with all of its shared properties.
     *
     * @param title    the title of the video
     * @param duration the duration in minutes
     */
    protected Video(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    /**
     * Returns every property of the video in a readable, single-line format.
     *
     * @return a human readable description of the video
     */
    public String getInfo() {
        return String.format("Title: %s | Duration: %d min", title, duration);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Returns the duration of the video in minutes.
     *
     * @return the duration in minutes
     */
    public int getDuration() {
        return duration;
    }

    /**
     * Sets the duration of the video.
     *
     * @param duration the duration in minutes
     */
    public void setDuration(int duration) {
        this.duration = duration;
    }
}
