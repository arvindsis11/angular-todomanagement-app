# ToDoManagement App using Angular+spring boot rest api

This is project to demonstrate ToDoManagement App with Angular 9+. It contains [all of the specs](https://angular.io/generated/live-examples/testing/app-specs.eplnkr.html) from Angular's test guide as well as [some extras](https://angular.io/generated/live-examples/testing/bag-specs.eplnkr.html). Specs have been reformatted and converted to using Intern best practices as outlined below.

## Get started

### Clone the repo

```shell
git clone https://github.com/arvindsis11/angular-todomanagement-app
cd angular-todomanagement-app
```

### Install npm packages

Install the `npm` packages described in the `package.json` and verify that it works:

```shell
npm install
npm start
```

The `npm start` command builds (compiles TypeScript and copies assets) the application into `dist/`, watches for changes to the source files, and runs `lite-server` on port `4200`.

Shut it down manually with `Ctrl-C`.

#### npm scripts

These are the most useful commands defined in `package.json`:

* `npm start` - runs the TypeScript compiler, asset copier, and a server at the same time, all three in "watch mode".
* `npm run build` - runs the TypeScript compiler and asset copier once.
* `npm run build:watch` - runs the TypeScript compiler and asset copier in "watch mode"; when changes occur to source files, they will be recompiled or copied into `dist/`.
* `npm run lint` - runs `tslint` on the project files.
* `npm run serve` - runs `lite-server`.

These are the test-related scripts:

* `npm test` - builds the application and runs Intern tests (both unit and functional) one time.
* `npm run ci` - cleans, lints, and builds the application and runs Intern tests (both unit and functional) one time.


## Run spring boot rest api `default port` = `localhost:8080`

