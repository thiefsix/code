/**
 * 
 */
function getPageSize(url){
	
	var pageSize=document.getElementById("pageSize").value;
	//alert(pageSize);
	
	url+=pageSize;
	
	//alert(url);
	
	location.href=url;
}

function getUrl(pageNow){
	
	location.href="\"/StudentManageSystem/showPageCourse?pageNow=" + pageNow + "&pageSize=10\"";
	
}