/*******************************************************************************
 * Copyright (c) 2017, 2020 Eurotech and/or its affiliates and others
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Eurotech - initial API and implementation
 *******************************************************************************/
package org.eclipse.kapua.broker.core.plugin.metric;

import com.codahale.metrics.Counter;
import com.codahale.metrics.Timer;
import org.eclipse.kapua.commons.metric.MetricServiceFactory;
import org.eclipse.kapua.commons.metric.MetricsService;

public class SubscribeMetric {

    private static final SubscribeMetric SUBSCRIBE_METRIC = new SubscribeMetric();

    private Counter allowedMessages;
    private Counter notAllowedMessages;
    private Timer time;

    public static SubscribeMetric getInstance() {
        return SUBSCRIBE_METRIC;
    }

    private SubscribeMetric() {
        MetricsService metricsService = MetricServiceFactory.getInstance();
        allowedMessages = metricsService.getCounter(SecurityMetrics.METRIC_MODULE_NAME, SecurityMetrics.METRIC_COMPONENT_SUBSCRIBE, SecurityMetrics.METRIC_ALLOWED, SecurityMetrics.METRIC_COUNT);
        notAllowedMessages = metricsService.getCounter(SecurityMetrics.METRIC_MODULE_NAME, SecurityMetrics.METRIC_COMPONENT_SUBSCRIBE, SecurityMetrics.METRIC_NOT_ALLOWED, SecurityMetrics.METRIC_COUNT);
        time = metricsService.getTimer(SecurityMetrics.METRIC_MODULE_NAME, SecurityMetrics.METRIC_COMPONENT_SUBSCRIBE, SecurityMetrics.METRIC_TIME, SecurityMetrics.METRIC_S);
    }

    public Counter getAllowedMessages() {
        return allowedMessages;
    }

    public Counter getNotAllowedMessages() {
        return notAllowedMessages;
    }

    public Timer getTime() {
        return time;
    }

}
