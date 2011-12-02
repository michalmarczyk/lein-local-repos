# lein-local-repos

A kludge to force Leiningen to use repositories specified under a
`:local-repositories` key in the `settings` map in `~/.lein/init.clj`.

## Usage

    ;;; in ~/.lein/init.clj
    (def settings
      ...
      :hooks [... leiningen.hooks.local-repos ...]
      ...)

## Fablo

This work was sponsored by Fablo (http://fablo.eu/). Fablo provides a
set of tools for building modern e-commerce storefronts. Tools include
a search engine, product and search result navigation, accelerators,
personalized recommendations, and real-time statistics and analytics.

## License

Copyright (C) 2011 Michał Marczyk

Distributed under the Eclipse Public License, the same as Clojure.
