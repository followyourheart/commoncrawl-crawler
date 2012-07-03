/**
 * Copyright 2008 - CommonCrawl Foundation
 * 
 *    This program is free software: you can redistribute it and/or modify
 *    it under the terms of the GNU General Public License as published by
 *    the Free Software Foundation, either version 3 of the License, or
 *    (at your option) any later version.
 *
 *    This program is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *    GNU General Public License for more details.
 *
 *    You should have received a copy of the GNU General Public License
 *    along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 **/

package org.commoncrawl.service.queryserver.query;

import org.commoncrawl.rpc.base.shared.RPCStruct;

/**
 * 
 * @author rana
 *
 * @param <DataType>
 * @param <KeyType>
 * @param <ValueType>
 */
public interface QueryCompletionCallback<DataType extends RPCStruct,KeyType,ValueType> {
    void queryComplete(QueryRequest<DataType,KeyType,ValueType> request,QueryResult<KeyType,ValueType> queryResult);
    void queryFailed(QueryRequest<DataType,KeyType,ValueType> request,String reason);
}