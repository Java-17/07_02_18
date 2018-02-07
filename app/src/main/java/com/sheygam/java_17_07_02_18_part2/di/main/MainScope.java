package com.sheygam.java_17_07_02_18_part2.di.main;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by gregorysheygam on 07/02/2018.
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface MainScope {
}
