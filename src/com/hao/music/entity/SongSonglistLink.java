package com.hao.music.entity;


//Song-Songlist
public class SongSonglistLink {
    private Integer id;
    private Song song;
    private Singer singer;

    public SongSonglistLink(Integer id, Song song, Singer singer) {
        this.id = id;
        this.song = song;
        this.singer = singer;
    }

    public SongSonglistLink() {
    }

    @Override
    public String toString() {
        return "SongSonglistLink{" +
                "id=" + id +
                ", Song=" + song +
                ", Singer=" + singer +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SongSonglistLink ss = (SongSonglistLink) o;

        if (id != null ? !id.equals(ss.id) : ss.id != null) return false;
        if (song != null ? !song.equals(ss.song) : ss.song != null) return false;
        return singer != null ? singer.equals(ss.singer) : ss.singer == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (song != null ? song.hashCode() : 0);
        result = 31 * result + (singer != null ? singer.hashCode() : 0);
        return result;
    }

    public SongSonglistLink(Song song, Singer singer) {
        this.song = song;
        this.singer = singer;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Song getSong() {
        return song;
    }

    public void setSong(Song song) {
        this.song = song;
    }

    public Singer getSinger() {
        return singer;
    }

    public void setSinger(Singer singer) {
        this.singer = singer;
    }
}