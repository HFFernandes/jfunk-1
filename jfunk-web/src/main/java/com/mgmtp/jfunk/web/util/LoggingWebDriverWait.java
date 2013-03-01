/*
 *  Copyright (C) 2013 mgm technology partners GmbH, Munich.
 *
 *  See the LICENSE file distributed with this work for additional
 *  information regarding copyright ownership and intellectual property rights.
 */
package com.mgmtp.jfunk.web.util;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.base.Function;
import com.google.common.base.Predicate;

/**
 * {@link WebDriverWait} decendant that writes a log message before {@link #until(Function)} or
 * {@link #until(Predicate)} is called.
 * 
 * @author rnaegele
 */
public class LoggingWebDriverWait extends WebDriverWait {

	private final Logger log = LoggerFactory.getLogger(getClass());

	public LoggingWebDriverWait(final WebDriver driver, final long timeOutInSeconds) {
		super(driver, timeOutInSeconds);
	}

	public LoggingWebDriverWait(final WebDriver driver, final long timeOutInSeconds, final long sleepInMillis) {
		super(driver, timeOutInSeconds, sleepInMillis);
	}

	@Override
	public <V> V until(final Function<? super WebDriver, V> function) {
		try {
			V result = super.until(function);
			log.info("Successfully waited for: {}", function);
			return result;
		} catch (TimeoutException ex) {
			log.error("Error waiting for: {}", function);
			throw ex;
		}
	}

	@Override
	public void until(final Predicate<WebDriver> predicate) {
		try {
			super.until(predicate);
			log.info("Successfully waited for: {}", predicate);
		} catch (TimeoutException ex) {
			log.error("Error waiting for: {}", predicate);
			throw ex;
		}
	}
}
