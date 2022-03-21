package com.essohpee.social.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serial;
import java.io.Serializable;

@Entity
@Getter
@Setter
@Table(name = "AppUserconnection")
public class AppUserConnection implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "Userid", length = 255, nullable = false)
    private String userId;

    @Id
    @Column(name = "Providerid", length = 255, nullable = false)
    private String providerId;

    @Id
    @Column(name = "Provideruserid", length = 255, nullable = false)
    private String providerUserId;

    @Column(name = "Rank", nullable = false)
    private int rank;

    @Column(name = "Displayname", length = 255, nullable = false)
    private String displayName;

    @Column(name = "Profileurl", length = 512, nullable = false)
    private String profileUrl;

    @Column(name = "Imageurl", length = 512, nullable = false)
    private String imageUrl;

    @Column(name = "Accesstoken", length = 512, nullable = false)
    private String accessToken;

    @Column(name = "Secret", length = 512, nullable = false)
    private String secret;

    @Column(name = "Refreshtoken", length = 512, nullable = false)
    private String refreshToken;

    @Column(name = "Expiretime", nullable = false)
    private Long expireTime;

}
