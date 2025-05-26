const gulp = require('gulp');
const sass = require('gulp-sass')(require('sass'));
const sourcemaps = require('gulp-sourcemaps');
const uglify = require('gulp-uglify');
const obfuscate = require('gulp-obfuscate');
const imagemin = require('gulp-imagemin');

// Compila o SASS
function compilaSass() {
    return gulp.src('./source/styles/main.scss')
        .pipe(sourcemaps.init())
        .pipe(sass({ outputStyle: 'compressed' }))
        .pipe(sourcemaps.write('./maps'))
        .pipe(gulp.dest('./build/styles'));
}

// Comprime as imagens
function comprimeImagem() {
    return gulp.src('./source/images/*.{png,jpg,jpeg,svg,gif}')
        .pipe(imagemin())
        .pipe(gulp.dest('./build/images'));
}

// Minifica e ofusca o JavaScript
function comprimeJavaScript() {
    return gulp.src('./source/scripts/*.js')
        .pipe(uglify())
        .pipe(obfuscate())
        .pipe(gulp.dest('./build/scripts'));
}

// Tarefa padrão
exports.default = gulp.series(compilaSass, comprimeImagem, comprimeJavaScript);
