package com.themoin.overseasremittance.interfaces.transfer.response;

import com.themoin.overseasremittance.common.response.ResultVo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class TransferQuoteVo extends ResultVo {

	private QuoteVo quoteVo;
}