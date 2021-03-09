# Matrial-Special-Toast
This is a simple library for show Toast in Android in different modes, which can be a simple and good alternative to ordinary and old Toast.
<!-- PROJECT LOGO -->
<br />
<p align="center">
  <a href="https://github.com/othneildrew/Best-README-Template">
    <img src="images/logo.png" alt="Logo" width="80" height="80">
  </a>

  <h3 align="center">Material Special Toast</h3>

  <p align="center">
    This is a simple library for show Toast in Android in different modes, which can be a simple and good alternative to ordinary and old Toast.
    <br />
    <a href="https://github.com/mhmdVoj"><strong>more About me »</strong></a>
    <br />
  </p>
</p>



<!-- TABLE OF CONTENTS -->
<details open="open">
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#installation">Installation</a></li>
      </ul>
    </li>
    <li><a href="#usage">Usage</a></li>
    <li><a href="#license">License</a></li>
    <li><a href="#contact">Contact</a></li>
    <li><a href="#acknowledgements">Acknowledgements</a></li>
  </ol>
</details>



<!-- ABOUT THE PROJECT -->
## About The Project

In Android projects, Toast display is one of the simple and useful ways to check different parts of the application. 
But the appearance of these Toasts is very simple and old (although they have been replaced by snakBars), but this library 
offers you a set of different Toast for different situations or even making a personal test with your favorite material.

Why should I use? :
* A good and simple alternative to regular Toasts
* Convenient options for the right situations
* Full customization (add icons, change colors and fonts)


<!-- GETTING STARTED -->
## Getting Started

To get started, you need to install this library in the Grald file of your project, and this is very simple ... :)


### Installation

Step 1. Add the JitPack repository to your build file
Add it in your root build.gradle at the end of repositories:
   ```sh
   allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
   ```
Step 2. Add the dependency
   ```sh
   dependencies {
	        implementation 'com.github.mhmdVoj:Matrial-Special-Toast:beta'
	}
   ```



<!-- USAGE EXAMPLES -->
## Usage

You do not have to work hard to get started with the library. Depending on your needs, you can use a variety of tests. 
Below are some examples of using MST : 


Simple formula to use :
```sh
  show_simple_toast.setOnClickListener {
            MaterialSpecialToast.[kind of Toast](
                [context],
                [message Toast],
                T[duration Toast]
            ).show()

        }
```
and if you need a Error Toast :
```sh
  show_alert_toast.setOnClickListener {
            MaterialSpecialToast.error(
                this,
                "This is a Error!",
                Toast.LENGTH_SHORT
            ).show()

        }
```

Warning Toast :
 ```sh
  show_warning_toast.setOnClickListener {
            MaterialSpecialToast.warning(
                this,
                "This is a warning",
                Toast.LENGTH_SHORT
            ).show()
        }

```

Info Toast : 
```sh
show_info_toast.setOnClickListener {
            MaterialSpecialToast.info(
                this,
                "This is a information",
                Toast.LENGTH_SHORT
            ).show()

        }
```

Success or agree Toast :
```sh
  show_success_toast.setOnClickListener {
            MaterialSpecialToast.success(
                this,
                "This is a Success",
                Toast.LENGTH_SHORT
            ).show()
        }
```
and also you can create a very custom Toast with for examle a icon to show :

```sh
show_custom_toast.setOnClickListener {
            MaterialSpecialToast.custom(
                this,
            "Happy Birth Day !",
            R.drawable.ic_baseline_cake_24,
            R.drawable.my_layot_toast,
            Toast.LENGTH_SHORT
            ).show()
        }
```


<!-- LICENSE -->
## License

Distributed under the MIT License. See `LICENSE` for more information.



<!-- CONTACT -->
## Contact

Your Name - Mohamad hasan vejdanizadeh - mohammadv7713@gmail.com <br>
Linkedin - @Mohamad Vejdanizadeh <br>
instagram - @Mohamad.vejdanizadeh



<!-- ACKNOWLEDGEMENTS -->
## Acknowledgements
* [GitHub Emoji Cheat Sheet](https://www.webpagefx.com/tools/emoji-cheat-sheet)
* [Img Shields](https://shields.io)
* [Choose an Open Source License](https://choosealicense.com)
* [GitHub Pages](https://pages.github.com)
* [Animate.css](https://daneden.github.io/animate.css)
* [Loaders.css](https://connoratherton.com/loaders)
* [Slick Carousel](https://kenwheeler.github.io/slick)
* [Smooth Scroll](https://github.com/cferdinandi/smooth-scroll)
* [Sticky Kit](http://leafo.net/sticky-kit)
* [JVectorMap](http://jvectormap.com)
* [Font Awesome](https://fontawesome.com)





<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
[contributors-shield]: https://img.shields.io/github/contributors/othneildrew/Best-README-Template.svg?style=for-the-badge
[contributors-url]: https://github.com/othneildrew/Best-README-Template/graphs/contributors
[forks-shield]: https://img.shields.io/github/forks/othneildrew/Best-README-Template.svg?style=for-the-badge
[forks-url]: https://github.com/othneildrew/Best-README-Template/network/members
[stars-shield]: https://img.shields.io/github/stars/othneildrew/Best-README-Template.svg?style=for-the-badge
[stars-url]: https://github.com/othneildrew/Best-README-Template/stargazers
[issues-shield]: https://img.shields.io/github/issues/othneildrew/Best-README-Template.svg?style=for-the-badge
[issues-url]: https://github.com/othneildrew/Best-README-Template/issues
[license-shield]: https://img.shields.io/github/license/othneildrew/Best-README-Template.svg?style=for-the-badge
[license-url]: https://github.com/othneildrew/Best-README-Template/blob/master/LICENSE.txt
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555
[linkedin-url]: https://linkedin.com/in/othneildrew
[product-screenshot]: images/screenshot.png
