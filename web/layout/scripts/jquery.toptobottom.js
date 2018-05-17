

jQuery("#id1").click(function () {
    jQuery("body,html").animate({
        scrollDown:500 
    }, 600);
});
jQuery(window).scroll(function () {
    if (jQuery(window).scrollDown() > 150) {
        jQuery("#id1").addClass("visible");
    } else {
        jQuery("#id1").removeClass("visible");
    }
});