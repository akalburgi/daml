.. Copyright (c) 2019 Digital Asset (Switzerland) GmbH and/or its affiliates. All rights reserved.
.. SPDX-License-Identifier: Apache-2.0

DAML SDK roadmap (as of April 2019)
===================================

This page specifies the major features we’re planning to add next to the DAML SDK. Plans and timelines are subject to change. If you need any of these features or want to request others, see the :doc:`/support/support` page for how to get in touch.

We plan to update this roadmap roughly every three months.

- **Windows support**

  Support for installing and running the SDK on Windows.

  `More about this on GitHub <https://github.com/DACH-NY/daml/issues/1147>`__.
- **Java ecosystem**
  
  Improve the :doc:`Java bindings </app-dev/bindings-java/index>` and add code generation that generates Java classes from DAML types.

  `More about this on GitHub <https://github.com/DACH-NY/daml/milestone/3>`__.
- **JavaScript / TypeScript ecosystem**

  Improve the currently experimental :doc:`JavaScript bindings </app-dev/bindings-js/index>` so they are stable, and add TypeScript code generation to generate code from DAML types.

  `More about this on GitHub <https://github.com/DACH-NY/daml/milestone/5>`__.
- **Simplified da assistant**

  Rewritten :doc:`command line for the SDK </tools/assistant>` with improved usability.

  `More about this on GitHub <https://github.com/DACH-NY/daml/issues/210>`__.
- **Native installers**

  Allow users to install the SDK using native installers like ``homebrew`` and ``apt-get``.

  `More about this on GitHub <https://github.com/DACH-NY/daml/issues/1148>`__.
- **Ledger SQL backend**

  Replace the in-memory store used by the Sandbox with a SQL backend, so it’s not just a development tool but also a persistent ledger you could deploy.

  `More about this on GitHub <https://github.com/DACH-NY/daml/milestone/2>`__.
- **Contract keys in SDK**

  Contract keys are a subset of fields in a contract that allow you to look it up uniquely. Building on top of the experimental contract keys feature in DAML, give contract keys full SDK support and write documentation.

  `More about this on GitHub <https://github.com/DACH-NY/daml/milestone/13>`__.

- **Map and Enum types in DAML-LF**

  Add ``Map`` and ``Enum`` types to DAML-LF (which is what DAML gets compiled to - it’s used by the Ledger API).

  `More about Map on GitHub <https://github.com/DACH-NY/daml/issues/1078>`__.

  `More about Enum on GitHub <https://github.com/DACH-NY/daml/issues/1081>`__.
- **Better package management**

  Make it easier to create packages and use packages.

  `More about this on GitHub <https://github.com/DACH-NY/daml/issues/1198>`__.
- **Web IDE**

  Provide a browser-based version of :doc:`DAML Studio </daml/daml-studio>` to make it easier to try DAML out.

  `More about this on GitHub <https://github.com/DACH-NY/daml/issues/1149>`__.
- **DAML-on-X self-service package**

  Make it easier for external developers to integrate DAML with other ledgers.

  `More about this on GitHub <https://github.com/DACH-NY/daml/issues/1154>`__. 