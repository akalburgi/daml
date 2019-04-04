// Copyright (c) 2019 Digital Asset (Switzerland) GmbH and/or its affiliates. All rights reserved.
// SPDX-License-Identifier: Apache-2.0

package com.digitalasset.daml.lf.codegen

import com.digitalasset.daml.lf.codegen.conf.Conf

import scala.util.control.NonFatal

object StandaloneMain {

  def main(args: Array[String]): Unit =
    try {
      Main.main(args)
    } catch {
      case NonFatal(x) => { x.printStackTrace(); sys.exit(-2) }
    }
}

object Main {
  def main(args: Array[String]): Unit =
    Conf.parse(args) match {
      case Some(conf) => CodeGenRunner.run(conf)
      case None =>
        throw new IllegalArgumentException(s"Invalid command line arguments: ${args.mkString(" ")}")
    }
}
