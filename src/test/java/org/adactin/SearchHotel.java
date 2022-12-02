package org.adactin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel extends BaseClassAdactin {

	public SearchHotel() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="location")
	private WebElement Locations;
	
	public WebElement getLocations() {
		return Locations;
	}
	
	@FindBy(id="hotels")
	private WebElement Hotels;
	
	public WebElement getHotels() {
		return Hotels;
	}
	
	@FindBy(id="room_type")
	private WebElement RoomType;
	
	@FindBy(id="room_nos")
	private WebElement RoomNos;
	
	public WebElement getRoomNos() {
		return RoomNos;
	}
	
	public WebElement getRoomType() {
		return RoomType;
	}
	
	@FindBy(id="datepick_in")
	private WebElement FromDate;
	
	@FindBy(id="datepick_out")
	private WebElement ToDate;
	
	public WebElement getFromDate() {
		return FromDate;
	}
	
	public WebElement getToDate() {
		return ToDate;
	}
	
	@FindBy(name="adult_room")
	private WebElement AdultsSelect;
	
	@FindBy(name="child_room")
	private WebElement ChildSelect;
	
	public WebElement getAdultsSelect() {
		return AdultsSelect;
	}
	
	public WebElement getChildSelect() {
		return ChildSelect;
	}
	
	@FindBy(id="Submit")
	private WebElement SearchBtn;
	
	public WebElement getSearchBtn() {
		return SearchBtn;
	}
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

