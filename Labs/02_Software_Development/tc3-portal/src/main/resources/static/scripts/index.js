// image-changer.js
// Copyright © 2018-2020 NextStep IT Training. All rights reserved.
//

$(document).ready( function () {

    let images = []
    let imageSelected = -1;

    function loadimages() {

        var names = [ 'anguilla', 'antigua', 'barbados', 'cartagena', 'curaco', 'dominica', 'jamaica', 'martinique', 'st-croix', 'st-kitts-and-nevis' ]

        for (var i = 0; i < names.length; i++) {

            let image = new Image()

            image.id = 'location-image'
            image.className = 'bar-image'
            image.src = $context + "images/" + names[i] + ".png"
            images.push(image)
        }
    }

    function changeimage() {

        let rnd;

        do {

            rnd = Math.floor(Math.random() * images.length)

        } while (rnd === imageSelected)

        imageSelected = rnd
        $('#location-image').replaceWith(images[imageSelected])
    }

    loadimages()
    changeimage()
    setInterval(changeimage, 5000)
})