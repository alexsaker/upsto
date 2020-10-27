package com.cnaf.upto.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import javax.xml.bind.annotation.*;

/**
 * DataSetListApis
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-10-27T08:19:42.829809+01:00[Europe/Paris]")
@JacksonXmlRootElement(localName = "DataSetListApis")
@XmlRootElement(name = "DataSetListApis")
@XmlAccessorType(XmlAccessType.FIELD)
public class DataSetListApis   {
  @JsonProperty("apiKey")
  @JacksonXmlProperty(localName = "apiKey")
  private String apiKey;

  @JsonProperty("apiVersionNumber")
  @JacksonXmlProperty(localName = "apiVersionNumber")
  private String apiVersionNumber;

  @JsonProperty("apiUrl")
  @JacksonXmlProperty(localName = "apiUrl")
  private String apiUrl;

  @JsonProperty("apiDocumentationUrl")
  @JacksonXmlProperty(localName = "apiDocumentationUrl")
  private String apiDocumentationUrl;

  public DataSetListApis apiKey(String apiKey) {
    this.apiKey = apiKey;
    return this;
  }

  /**
   * To be used as a dataset parameter value
   * @return apiKey
  */
  @ApiModelProperty(value = "To be used as a dataset parameter value")


  public String getApiKey() {
    return apiKey;
  }

  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }

  public DataSetListApis apiVersionNumber(String apiVersionNumber) {
    this.apiVersionNumber = apiVersionNumber;
    return this;
  }

  /**
   * To be used as a version parameter value
   * @return apiVersionNumber
  */
  @ApiModelProperty(value = "To be used as a version parameter value")


  public String getApiVersionNumber() {
    return apiVersionNumber;
  }

  public void setApiVersionNumber(String apiVersionNumber) {
    this.apiVersionNumber = apiVersionNumber;
  }

  public DataSetListApis apiUrl(String apiUrl) {
    this.apiUrl = apiUrl;
    return this;
  }

  /**
   * The URL describing the dataset's fields
   * @return apiUrl
  */
  @ApiModelProperty(value = "The URL describing the dataset's fields")


  public String getApiUrl() {
    return apiUrl;
  }

  public void setApiUrl(String apiUrl) {
    this.apiUrl = apiUrl;
  }

  public DataSetListApis apiDocumentationUrl(String apiDocumentationUrl) {
    this.apiDocumentationUrl = apiDocumentationUrl;
    return this;
  }

  /**
   * A URL to the API console for each API
   * @return apiDocumentationUrl
  */
  @ApiModelProperty(value = "A URL to the API console for each API")


  public String getApiDocumentationUrl() {
    return apiDocumentationUrl;
  }

  public void setApiDocumentationUrl(String apiDocumentationUrl) {
    this.apiDocumentationUrl = apiDocumentationUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataSetListApis dataSetListApis = (DataSetListApis) o;
    return Objects.equals(this.apiKey, dataSetListApis.apiKey) &&
        Objects.equals(this.apiVersionNumber, dataSetListApis.apiVersionNumber) &&
        Objects.equals(this.apiUrl, dataSetListApis.apiUrl) &&
        Objects.equals(this.apiDocumentationUrl, dataSetListApis.apiDocumentationUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiKey, apiVersionNumber, apiUrl, apiDocumentationUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataSetListApis {\n");
    
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
    sb.append("    apiVersionNumber: ").append(toIndentedString(apiVersionNumber)).append("\n");
    sb.append("    apiUrl: ").append(toIndentedString(apiUrl)).append("\n");
    sb.append("    apiDocumentationUrl: ").append(toIndentedString(apiDocumentationUrl)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

