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
 * InlineObject
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-10-27T08:19:42.829809+01:00[Europe/Paris]")
@JacksonXmlRootElement(localName = "InlineObject")
@XmlRootElement(name = "InlineObject")
@XmlAccessorType(XmlAccessType.FIELD)
public class InlineObject   {
  @JsonProperty("criteria")
  @JacksonXmlProperty(localName = "criteria")
  private String criteria = "*:*";

  @JsonProperty("start")
  @JacksonXmlProperty(localName = "start")
  private Integer start = 0;

  @JsonProperty("rows")
  @JacksonXmlProperty(localName = "rows")
  private Integer rows = 100;

  public InlineObject criteria(String criteria) {
    this.criteria = criteria;
    return this;
  }

  /**
   * Uses Lucene Query Syntax in the format of propertyName:value, propertyName:[num1 TO num2] and date range format: propertyName:[yyyyMMdd TO yyyyMMdd]. In the response please see the 'docs' element which has the list of record objects. Each record structure would consist of all the fields and their corresponding values.
   * @return criteria
  */
  @ApiModelProperty(required = true, value = "Uses Lucene Query Syntax in the format of propertyName:value, propertyName:[num1 TO num2] and date range format: propertyName:[yyyyMMdd TO yyyyMMdd]. In the response please see the 'docs' element which has the list of record objects. Each record structure would consist of all the fields and their corresponding values.")
  @NotNull


  public String getCriteria() {
    return criteria;
  }

  public void setCriteria(String criteria) {
    this.criteria = criteria;
  }

  public InlineObject start(Integer start) {
    this.start = start;
    return this;
  }

  /**
   * Starting record number. Default value is 0.
   * @return start
  */
  @ApiModelProperty(value = "Starting record number. Default value is 0.")


  public Integer getStart() {
    return start;
  }

  public void setStart(Integer start) {
    this.start = start;
  }

  public InlineObject rows(Integer rows) {
    this.rows = rows;
    return this;
  }

  /**
   * Specify number of rows to be returned. If you run the search with default values, in the response you will see 'numFound' attribute which will tell the number of records available in the dataset.
   * @return rows
  */
  @ApiModelProperty(value = "Specify number of rows to be returned. If you run the search with default values, in the response you will see 'numFound' attribute which will tell the number of records available in the dataset.")


  public Integer getRows() {
    return rows;
  }

  public void setRows(Integer rows) {
    this.rows = rows;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject inlineObject = (InlineObject) o;
    return Objects.equals(this.criteria, inlineObject.criteria) &&
        Objects.equals(this.start, inlineObject.start) &&
        Objects.equals(this.rows, inlineObject.rows);
  }

  @Override
  public int hashCode() {
    return Objects.hash(criteria, start, rows);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject {\n");
    
    sb.append("    criteria: ").append(toIndentedString(criteria)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
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

