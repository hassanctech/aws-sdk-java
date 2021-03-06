/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetOriginRequestPolicyConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetOriginRequestPolicyConfigResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The origin request policy configuration.
     * </p>
     */
    private OriginRequestPolicyConfig originRequestPolicyConfig;
    /**
     * <p>
     * The current version of the origin request policy.
     * </p>
     */
    private String eTag;

    /**
     * <p>
     * The origin request policy configuration.
     * </p>
     * 
     * @param originRequestPolicyConfig
     *        The origin request policy configuration.
     */

    public void setOriginRequestPolicyConfig(OriginRequestPolicyConfig originRequestPolicyConfig) {
        this.originRequestPolicyConfig = originRequestPolicyConfig;
    }

    /**
     * <p>
     * The origin request policy configuration.
     * </p>
     * 
     * @return The origin request policy configuration.
     */

    public OriginRequestPolicyConfig getOriginRequestPolicyConfig() {
        return this.originRequestPolicyConfig;
    }

    /**
     * <p>
     * The origin request policy configuration.
     * </p>
     * 
     * @param originRequestPolicyConfig
     *        The origin request policy configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOriginRequestPolicyConfigResult withOriginRequestPolicyConfig(OriginRequestPolicyConfig originRequestPolicyConfig) {
        setOriginRequestPolicyConfig(originRequestPolicyConfig);
        return this;
    }

    /**
     * <p>
     * The current version of the origin request policy.
     * </p>
     * 
     * @param eTag
     *        The current version of the origin request policy.
     */

    public void setETag(String eTag) {
        this.eTag = eTag;
    }

    /**
     * <p>
     * The current version of the origin request policy.
     * </p>
     * 
     * @return The current version of the origin request policy.
     */

    public String getETag() {
        return this.eTag;
    }

    /**
     * <p>
     * The current version of the origin request policy.
     * </p>
     * 
     * @param eTag
     *        The current version of the origin request policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOriginRequestPolicyConfigResult withETag(String eTag) {
        setETag(eTag);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getOriginRequestPolicyConfig() != null)
            sb.append("OriginRequestPolicyConfig: ").append(getOriginRequestPolicyConfig()).append(",");
        if (getETag() != null)
            sb.append("ETag: ").append(getETag());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetOriginRequestPolicyConfigResult == false)
            return false;
        GetOriginRequestPolicyConfigResult other = (GetOriginRequestPolicyConfigResult) obj;
        if (other.getOriginRequestPolicyConfig() == null ^ this.getOriginRequestPolicyConfig() == null)
            return false;
        if (other.getOriginRequestPolicyConfig() != null && other.getOriginRequestPolicyConfig().equals(this.getOriginRequestPolicyConfig()) == false)
            return false;
        if (other.getETag() == null ^ this.getETag() == null)
            return false;
        if (other.getETag() != null && other.getETag().equals(this.getETag()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOriginRequestPolicyConfig() == null) ? 0 : getOriginRequestPolicyConfig().hashCode());
        hashCode = prime * hashCode + ((getETag() == null) ? 0 : getETag().hashCode());
        return hashCode;
    }

    @Override
    public GetOriginRequestPolicyConfigResult clone() {
        try {
            return (GetOriginRequestPolicyConfigResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
