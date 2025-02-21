// // const s=require("Shery")
// // import Shery from "sheryjs";
// // const Shery=require("sheryjs")

// // Shery.mouseFollower({
// //     //Parameters are optional.
// //     skew: true,
// //     ease: "cubic-bezier(0.23, 1, 0.320, 1)",
// //     duration: 1,
// //   });

// //  Shery.mouseFollower();
// let clientX = -100;
// let clientY = -100;
// const innerCursor = document.querySelector(".cursor--small");

// const initCursor = () => {

//   document.addEventListener("mousemove", e => {
//     clientX = e.clientX;
//     clientY = e.clientY;
//   });
  
  
//   const render = () => {
//     innerCursor.style.transform = `translate(${clientX}px, ${clientY}px)`;
    
//     requestAnimationFrame(render);
//   };
//   requestAnimationFrame(render);
// };

// initCursor();
// let lastX = 0;
// let lastY = 0;
// let isStuck = false;
// let showCursor = false;
// let group, stuckX, stuckY, fillOuterCursor;

// const initCanvas = () => {
//   const canvas = document.querySelector(".cursor--canvas");
//   const shapeBounds = {
//     width: 75,
//     height: 75
//   };
//   paper.setup(canvas);
//   const strokeColor = "rgba(255, 0, 0, 0.5)";
//   const strokeWidth = 1;
//   const segments = 8;
//   const radius = 25;
  
//   const noiseScale = 150; // speed
//   const noiseRange = 4; // range of distortion
//   let isNoisy = false; // state
  
//   const polygon = new paper.Path.RegularPolygon(
//     new paper.Point(0, 0),
//     segments,
//     radius
//   );
//   polygon.strokeColor = strokeColor;
//   polygon.strokeWidth = strokeWidth;
//   polygon.smooth();
//   group = new paper.Group([polygon]);
//   group.applyMatrix = false;
  
//   const noiseObjects = polygon.segments.map(() => new SimplexNoise());
//   let bigCoordinates = [];
  
  
//   const lerp = (a, b, n) => {
//     return (1 - n) * a + n * b;
//   };
//   const map = (value, in_min, in_max, out_min, out_max) => {
//     return (
//       ((value - in_min) * (out_max - out_min)) / (in_max - in_min) + out_min
//     );
//   };
  
//   paper.view.onFrame = event => {
   
//     lastX = lerp(lastX, clientX, 0.2);
//     lastY = lerp(lastY, clientY, 0.2);
//     group.position = new paper.Point(lastX, lastY);
//   }
// }

// initCanvas();
// const initHovers = () => {

//   const handleMouseEnter = e => {
//     const navItem = e.currentTarget;
//     const navItemBox = navItem.getBoundingClientRect();
//     stuckX = Math.round(navItemBox.left + navItemBox.width / 2);
//     stuckY = Math.round(navItemBox.top + navItemBox.height / 2);
//     isStuck = true;
//   };
  
//   const handleMouseLeave = () => {
//     isStuck = false;
//   };
  
//   //Event listeners
//   const linkItems = document.querySelectorAll(".link");
//   linkItems.forEach(item => {
//     item.addEventListener("mouseenter", handleMouseEnter);
//     item.addEventListener("mouseleave", handleMouseLeave);
//   });
// };

// initHovers();
$(window).mousemove(function (e) {
	$(".ring").css(
		"transform",
		`translateX(calc(${e.clientX}px - 1.25rem)) translateY(calc(${e.clientY}px - 1.25rem))`
	);
});
