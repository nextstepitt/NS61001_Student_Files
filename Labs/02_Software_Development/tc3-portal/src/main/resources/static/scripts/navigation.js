// image-changer.js
// Copyright © 2018-2020 NextStep IT Training. All rights reserved.
//


$(document).ready( function () {

    var navigationRight = $('.navigation-right')
    var profileMenu = $('.profile-menu')
    var profileMenuButtons = $('.profile-menu > .navbutton')

    // Set the size of the menu and buttons to match the username.

    profileMenu.css({ top: Math.floor(navigationRight.height()) + 'px' });
    profileMenuButtons.css({ width: Math.floor(navigationRight.width()) + 'px' });

    // Bind the function to display the menu to the profile button.

    $('#profile-button').click( function (event) {

        profileMenu.show()

        // Add an event handler to the window to handle any clicks anywhere.

        $(window).click(function () {

            // This hides the menu under all circumstances.

            if ($(profileMenu).is(':visible')) {

                // Unbind the click event from the window (not needed anymore) and hide the menu.

                $(window).unbind('click')
                profileMenu.hide();
            }
        })

        // Block the current click from proceeding.

        event.stopPropagation();
    })

    // Bind the click event on the profile menu to block clicks; do this once it will stick.

    $(profileMenu).click(function (event) {

        // This keeps the menu up by stopping the click event.

        event.stopPropagation();
    })
})

