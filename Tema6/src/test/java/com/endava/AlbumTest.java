package com.endava;

import org.junit.Assert;
import org.junit.Test;

public class AlbumTest {

    @Test
    public void albumTest() {

        PhotoAlbum defaultPhotoAlbum = new PhotoAlbum();
        PhotoAlbum specificPhotoAlbum = new PhotoAlbum(24);
        BigPhotoAlbum bigPhotoAlbum = new BigPhotoAlbum();

        Assert.assertEquals(16, defaultPhotoAlbum.getNumberOfPages());
        Assert.assertEquals(24, specificPhotoAlbum.getNumberOfPages());
        Assert.assertEquals(64, bigPhotoAlbum.getNumberOfPages());
    }
}
