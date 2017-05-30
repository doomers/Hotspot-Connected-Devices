/*
 * Copyright 2013 WhiteByte (Nick Russler, Ahmet Yueksektepe).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.doomers.hotspotcontroller.wifihotspotutils;

import android.view.View;

public class ClientScanResult {

	private String IpAddr;
	private String HwType;
	private String Flags;
	private String HWAddr;
	private String Mask;
	private String Device;
	private boolean isReachable;
	private View.OnClickListener requestBtnClickListener;


	public String getHwType() {
		return HwType;
	}

	public void setHwType(String hwType) {
		HwType = hwType;
	}

	public String getFlags() {
		return Flags;
	}

	public void setFlags(String flags) {
		Flags = flags;
	}

	public String getMask() {
		return Mask;
	}

	public void setMask(String mask) {
		Mask = mask;
	}

	public ClientScanResult(String ipAddr, String HwType, String Flags, String HWAddr, String Mask, String device, boolean isReachable) {
		super();

		this.IpAddr = ipAddr;
		this.HwType = HwType;
		this.Flags = Flags;
		this.HWAddr = HWAddr;
		this.Mask = Mask;
		this.Device = device;
		this.isReachable = isReachable;
	}

	public String getIpAddr() {
		return IpAddr;
	}
	public void setIpAddr(String ipAddr) {
		IpAddr = ipAddr;
	}


	public String getHWAddr() {
		return HWAddr;
	}
	public void setHWAddr(String hWAddr) {
		HWAddr = hWAddr;
	}

	
	public String getDevice() {
		return Device;
	}
	public void setDevice(String device) {
		Device = device;
	}

	
	public boolean isReachable() {
		return isReachable;
	}
	public void setReachable(boolean isReachable) {
		this.isReachable = isReachable;
	}

	public View.OnClickListener getRequestBtnClickListener() {
		return requestBtnClickListener;
	}

	public void setRequestBtnClickListener(View.OnClickListener requestBtnClickListener) {
		this.requestBtnClickListener = requestBtnClickListener;
	}

	
}