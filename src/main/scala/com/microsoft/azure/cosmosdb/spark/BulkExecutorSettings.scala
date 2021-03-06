/**
  * The MIT License (MIT)
  * Copyright (c) 2020 Microsoft Corporation
  *
  * Permission is hereby granted, free of charge, to any person obtaining a copy
  * of this software and associated documentation files (the "Software"), to deal
  * in the Software without restriction, including without limitation the rights
  * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
  * copies of the Software, and to permit persons to whom the Software is
  * furnished to do so, subject to the following conditions:
  *
  * The above copyright notice and this permission notice shall be included in all
  * copies or substantial portions of the Software.
  *
  * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
  * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
  * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
  * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
  * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
  * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
  * SOFTWARE.
  */
package com.microsoft.azure.cosmosdb.spark

/**
  * Case class for the configuration settings used to initiate bulk executors
  *
  * @param maxMiniBatchUpdateCount         specifies the maximum count of update items in a mini-batch
  *                                        used in bulk import API. Default value is 500
  * @param maxMiniBatchImportSizeKB        specifies the max mini-batch size (specific to bulk import API) i bytes.
  *                                        Default value is 220200
  * @param maxThroughputForBulkOperations  specifies the throughput allocated for bulk operations out of the
  *                                        collection's total throughput (optional). If not specified the entire
  *                                        provisioned throughput for the container can be used for bulk operations
  * @param partitionKeyOption              Can be used to specify the partition key (optional). If not specified the
  *                                        partition key definition is retrieved at runtime for the target container
  */
private[spark] case class BulkExecutorSettings(
                                 maxMiniBatchUpdateCount: Int,
                                 maxMiniBatchImportSizeKB: Int,
                                 maxThroughputForBulkOperations: Option[Int],
                                 partitionKeyOption: Option[String])