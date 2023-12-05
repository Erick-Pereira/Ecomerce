<script setup>
import { ref, computed,reactive  } from 'vue'
defineProps(['Nome', 'Valor','Quantidade', 'Imagem','Link'])

const emit = defineEmits(['Delete','QtdMais','QtdMenos'])

function QtdMais(){
emit('QtdMais')
}
function QtdMenos(){
emit('QtdMenos')
}
function Delete(){
emit('Delete')
}
</script>
<template>
    <tr class="MuiTableRow-root">
        <th class="MuiTableCell-root MuiTableCell-body MuiTableCell-alignCenter" role="cell" scope="row">
            <a class="jss110" :href="Link">
                <img :src="Imagem" alt width="100">
            </a>
        </th>
        <td class="MuiTableCell-root MuiTableCell-body MuiTableCell-alignLeft" style="min-width: 200px;">
            <h5 class="MuiTypography-root jss447 MuiTypography-h6">
                <a class="jss110" :href="Link">
                    <span class="text-dark d-inline-block align-middle">{{ Nome }}</span>
                </a>
            </h5>
        </td>
        <td class="MuiTableCell-root MuiTableCell-body MuiTableCell-alignCenter" width="110">
            <button
                class="MuiButtonBase-root MuiButton-root MuiButton-text jss443 MuiButton-textSizeSmall MuiButton-sizeSmall" v-bind:class = "(Quantidade==1)?'Mui-disabled Mui-disabled':''"
                tabindex="-1" type="button" :disabled="Quantidade == 1" @click="Quantidade--, QtdMenos()" >
                <span class="MuiButton-label">
                    <svg class="MuiSvgIcon-root" focusable="false" viewBox="0 0 24 24" aria-hidden="true">
                        <path d="M19 13H5v-2h14v2z"></path>
                    </svg>
                </span>
            </button>
            {{Quantidade}}
            <button class="MuiButtonBase-root MuiButton-root MuiButton-text jss443 MuiButton-textSizeSmall MuiButton-sizeSmall" tabindex="0" type="button">
                <span class="MuiButton-label" @click="Quantidade++, QtdMais()">
                    <svg class="MuiSvgIcon-root" focusable="false" viewBox="0 0 24 24" aria-hidden="true">
                        <path d="M19 13h-6v6h-2v-6H5v-2h6V5h2v6h6v2z"></path>
                    </svg>
                </span>
                <span class="MuiTouchRipple-root"></span>
            </button>
        </td>
        <td class="MuiTableCell-root MuiTableCell-body MuiTableCell-alignCenter" style="width: 160px;">{{ Quantidade }} X {{ Valor }}</td>
        <td class="MuiTableCell-root MuiTableCell-body" width="40">
            <button class="MuiButtonBase-root MuiIconButton-root" @click="Quantidade= 0, Delete()" tabindex="0" type="button" aria-label="delete">
                <span class="MuiIconButton-label">
                    <svg class="MuiSvgIcon-root" focusable="false" viewBox="0 0 24 24" aria-hidden="true">
                        <path d="M6 19c0 1.1.9 2 2 2h8c1.1 0 2-.9 2-2V7H6v12zM19 4h-3.5l-1-1h-5l-1 1H5v2h14V4z"></path>
                    </svg>
                </span>
                <span class="MuiTouchRipple-root"></span>
            </button>
        </td>
    </tr>
</template>
<style scoped>

.MuiTableCell-root {
  display: table-cell;
  padding: 16px;
  font-size: 0.875rem;
  text-align: left;
  font-family: Roboto, Verdana;
  font-weight: 400;
  line-height: 1.43;
  border-bottom: 1px solid
    rgba(81, 81, 81, 1);
  vertical-align: inherit;
}
.MuiTableCell-head {
  color: #fff;
  font-weight: 500;
  line-height: 1.5rem;
}
.MuiTableCell-body {
  color: #fff;
}
.MuiTableCell-footer {
  color: rgba(255, 255, 255, 0.7);
  font-size: 0.75rem;
  line-height: 1.3125rem;
}
.MuiTableCell-sizeSmall {
  padding: 6px 24px 6px 16px;
}
.MuiTableCell-sizeSmall:last-child {
  padding-right: 16px;
}
.MuiTableCell-sizeSmall.MuiTableCell-paddingCheckbox {
  width: 24px;
  padding: 0 12px 0 16px;
}
.MuiTableCell-sizeSmall.MuiTableCell-paddingCheckbox:last-child {
  padding-left: 12px;
  padding-right: 16px;
}
.MuiTableCell-sizeSmall.MuiTableCell-paddingCheckbox > * {
  padding: 0;
}
.MuiTableCell-paddingCheckbox {
  width: 48px;
  padding: 0 0 0 4px;
}
.MuiTableCell-paddingCheckbox:last-child {
  padding-left: 0;
  padding-right: 4px;
}
.MuiTableCell-paddingNone {
  padding: 0;
}
.MuiTableCell-paddingNone:last-child {
  padding: 0;
}
.MuiTableCell-alignLeft {
  text-align: left;
}
.MuiTableCell-alignCenter {
  text-align: center;
}
.MuiTableCell-alignRight {
  text-align: right;
  flex-direction: row-reverse;
}
.MuiTableCell-alignJustify {
  text-align: justify;
}
.MuiTableCell-stickyHeader {
  top: 0;
  left: 0;
  z-index: 2;
  position: sticky;
  background-color: #303030;
}
.MuiTableRow-root {
  color: inherit;
  display: table-row;
  outline: 0;
  vertical-align: middle;
}
.MuiTableRow-root.MuiTableRow-hover:hover {
  background-color: rgba(255, 255, 255, 0.08);
}
.MuiTableRow-root.Mui-selected, .MuiTableRow-root.Mui-selected:hover {
  background-color: rgba(0, 158, 42, 0.16);
}

.MuiTypography-root {
  margin: 0;
}
.MuiTypography-body2 {
  font-size: 0.875rem;
  font-family: Roboto, Verdana;
  font-weight: 400;
  line-height: 1.43;
}
.MuiTypography-body1 {
  font-size: 1rem;
  font-family: Roboto, Verdana;
  font-weight: 400;
  line-height: 1.5;
}
.MuiTypography-caption {
  font-size: 0.75rem;
  font-family: Roboto, Verdana;
  font-weight: 400;
  line-height: 1.66;
}
.MuiTypography-button {
  font-size: 0.875rem;
  font-family: Roboto, Verdana;
  font-weight: 500;
  line-height: 1.75;
  text-transform: uppercase;
}
.MuiTypography-h1 {
  font-size: 6rem;
  font-family: Roboto, Verdana;
  font-weight: 300;
  line-height: 1.167;
}
.MuiTypography-h2 {
  font-size: 3.75rem;
  font-family: Roboto, Verdana;
  font-weight: 300;
  line-height: 1.2;
}
.MuiTypography-h3 {
  font-size: 3rem;
  font-family: Roboto, Verdana;
  font-weight: 400;
  line-height: 1.167;
}
.MuiTypography-h4 {
  font-size: 2.125rem;
  font-family: Roboto, Verdana;
  font-weight: 400;
  line-height: 1.235;
}
.MuiTypography-h5 {
  font-size: 1.5rem;
  font-family: Roboto, Verdana;
  font-weight: 400;
  line-height: 1.334;
}
.MuiTypography-h6 {
  font-size: 1.25rem;
  font-family: Roboto, Verdana;
  font-weight: 500;
  line-height: 1.6;
}
.MuiTypography-subtitle1 {
  font-size: 1rem;
  font-family: Roboto, Verdana;
  font-weight: 400;
  line-height: 1.75;
}
.MuiTypography-subtitle2 {
  font-size: 0.875rem;
  font-family: Roboto, Verdana;
  font-weight: 500;
  line-height: 1.57;
}
.MuiTypography-overline {
  font-size: 0.75rem;
  font-family: Roboto, Verdana;
  font-weight: 400;
  line-height: 2.66;
  text-transform: uppercase;
}
.MuiTypography-srOnly {
  width: 1px;
  height: 1px;
  overflow: hidden;
  position: absolute;
}
.MuiTypography-alignLeft {
  text-align: left;
}
.MuiTypography-alignCenter {
  text-align: center;
}
.MuiTypography-alignRight {
  text-align: right;
}
.MuiTypography-alignJustify {
  text-align: justify;
}
.MuiTypography-noWrap {
  overflow: hidden;
  white-space: nowrap;
  text-overflow: ellipsis;
}
.MuiTypography-gutterBottom {
  margin-bottom: 0.35em;
}
.MuiTypography-paragraph {
  margin-bottom: 16px;
}
.MuiTypography-colorInherit {
  color: inherit;
}

.MuiTypography-root {
  margin: 0;
}
.MuiTypography-body2 {
  font-size: 0.875rem;
  font-family: "Roboto", "Helvetica", "Arial", sans-serif;
  font-weight: 400;
  line-height: 1.43;
  letter-spacing: 0.01071em;
}
.MuiTypography-body1 {
  font-size: 1rem;
  font-family: "Roboto", "Helvetica", "Arial", sans-serif;
  font-weight: 400;
  line-height: 1.5;
  letter-spacing: 0.00938em;
}
.MuiTypography-caption {
  font-size: 0.75rem;
  font-family: "Roboto", "Helvetica", "Arial", sans-serif;
  font-weight: 400;
  line-height: 1.66;
  letter-spacing: 0.03333em;
}
.MuiTypography-button {
  font-size: 0.875rem;
  font-family: "Roboto", "Helvetica", "Arial", sans-serif;
  font-weight: 500;
  line-height: 1.75;
  letter-spacing: 0.02857em;
  text-transform: uppercase;
}
.MuiTypography-h1 {
  font-size: 6rem;
  font-family: "Roboto", "Helvetica", "Arial", sans-serif;
  font-weight: 300;
  line-height: 1.167;
  letter-spacing: -0.01562em;
}
.MuiTypography-h2 {
  font-size: 3.75rem;
  font-family: "Roboto", "Helvetica", "Arial", sans-serif;
  font-weight: 300;
  line-height: 1.2;
  letter-spacing: -0.00833em;
}
.MuiTypography-h3 {
  font-size: 3rem;
  font-family: "Roboto", "Helvetica", "Arial", sans-serif;
  font-weight: 400;
  line-height: 1.167;
  letter-spacing: 0em;
}
.MuiTypography-h4 {
  font-size: 2.125rem;
  font-family: "Roboto", "Helvetica", "Arial", sans-serif;
  font-weight: 400;
  line-height: 1.235;
  letter-spacing: 0.00735em;
}
.MuiTypography-h5 {
  font-size: 1.5rem;
  font-family: "Roboto", "Helvetica", "Arial", sans-serif;
  font-weight: 400;
  line-height: 1.334;
  letter-spacing: 0em;
}
.MuiTypography-h6 {
  font-size: 1.25rem;
  font-family: "Roboto", "Helvetica", "Arial", sans-serif;
  font-weight: 500;
  line-height: 1.6;
  letter-spacing: 0.0075em;
}
.MuiTypography-subtitle1 {
  font-size: 1rem;
  font-family: "Roboto", "Helvetica", "Arial", sans-serif;
  font-weight: 400;
  line-height: 1.75;
  letter-spacing: 0.00938em;
}
.MuiTypography-subtitle2 {
  font-size: 0.875rem;
  font-family: "Roboto", "Helvetica", "Arial", sans-serif;
  font-weight: 500;
  line-height: 1.57;
  letter-spacing: 0.00714em;
}
.MuiTypography-overline {
  font-size: 0.75rem;
  font-family: "Roboto", "Helvetica", "Arial", sans-serif;
  font-weight: 400;
  line-height: 2.66;
  letter-spacing: 0.08333em;
  text-transform: uppercase;
}
.MuiTypography-srOnly {
  width: 1px;
  height: 1px;
  overflow: hidden;
  position: absolute;
}
.MuiTypography-alignLeft {
  text-align: left;
}
.MuiTypography-alignCenter {
  text-align: center;
}
.MuiTypography-alignRight {
  text-align: right;
}
.MuiTypography-alignJustify {
  text-align: justify;
}
.MuiTypography-noWrap {
  overflow: hidden;
  white-space: nowrap;
  text-overflow: ellipsis;
}
.MuiTypography-gutterBottom {
  margin-bottom: 0.35em;
}
.MuiTypography-paragraph {
  margin-bottom: 16px;
}
.MuiTypography-colorInherit {
  color: inherit;
}
.MuiTypography-colorPrimary {
  color: #3f51b5;
}
.MuiTypography-colorSecondary {
  color: #f50057;
}
.MuiTypography-colorTextPrimary {
  color: rgba(0, 0, 0, 0.87);
}
.MuiTypography-colorTextSecondary {
  color: rgba(0, 0, 0, 0.54);
}
.MuiTypography-colorError {
  color: #f44336;
}
.MuiTypography-displayInline {
  display: inline;
}
.MuiTypography-displayBlock {
  display: block;
}
.MuiTypography-colorPrimary {
  color: #e90313;
}
.MuiTypography-colorSecondary {
  color: #009e2a;
}
.MuiTypography-colorTextPrimary {
  color: #fff;
}
.MuiTypography-colorTextSecondary {
  color: rgba(255, 255, 255, 0.7);
}
.MuiTypography-colorError {
  color: #f44336;
}
.MuiTypography-displayInline {
  display: inline;
}
.MuiTypography-displayBlock {
  display: block;
}

.MuiButtonBase-root {
  color: inherit;
  border: 0;
  cursor: pointer;
  margin: 0;
  display: inline-flex;
  outline: 0;
  padding: 0;
  position: relative;
  align-items: center;
  user-select: none;
  border-radius: 0;
  vertical-align: middle;
  -moz-appearance: none;
  justify-content: center;
  text-decoration: none;
  background-color: transparent;
  -webkit-appearance: none;
  -webkit-tap-highlight-color: transparent;
}
.MuiButtonBase-root::-moz-focus-inner {
  border-style: none;
}
.MuiButtonBase-root.Mui-disabled {
  cursor: default;
  pointer-events: none;
}
@media print {
  .MuiButtonBase-root {
    -webkit-print-color-adjust: exact;
  }
}
.jss446 {
  min-width: 500px;
}
.jss447 {
  font-size: 16px;
  margin-bottom: 1rem;
}

.MuiButtonBase-root {
  color: inherit;
  border: 0;
  cursor: pointer;
  margin: 0;
  display: inline-flex;
  outline: 0;
  padding: 0;
  position: relative;
  align-items: center;
  user-select: none;
  border-radius: 0;
  vertical-align: middle;
  -moz-appearance: none;
  justify-content: center;
  text-decoration: none;
  background-color: transparent;
  -webkit-appearance: none;
  -webkit-tap-highlight-color: transparent;
}
.MuiButtonBase-root::-moz-focus-inner {
  border-style: none;
}
.MuiButtonBase-root.Mui-disabled {
  cursor: default;
  pointer-events: none;
}
@media print {
  .MuiButtonBase-root {
    -webkit-print-color-adjust: exact;
  }
}
.jss110 {
  color: inherit;
  text-decoration: none;
}
.jss110:hover {
  text-decoration: none;
}
.jss448 {
  margin: 0;
  padding: 1rem 0 0 0;
  overflow: auto;
  list-style: none;
  max-height: 250px;
}
.jss449 {
  display: block;
  margin-bottom: 0.5rem;
}
.jss450 {
  display: block;
}
.jss451 {
  display: block;
  margin-left: 0.5rem;
  margin-bottom: 0.25rem;
}

.MuiButton-root {
  color: #fff;
  padding: 6px 16px;
  font-size: 0.875rem;
  min-width: 64px;
  box-sizing: border-box;
  transition: background-color 250ms cubic-bezier(0.4, 0, 0.2, 1) 0ms,box-shadow 250ms cubic-bezier(0.4, 0, 0.2, 1) 0ms,border 250ms cubic-bezier(0.4, 0, 0.2, 1) 0ms;
  font-family: Roboto, Verdana;
  font-weight: 500;
  line-height: 1.75;
  border-radius: 4px;
  text-transform: uppercase;
}
.MuiButton-root:hover {
  text-decoration: none;
  background-color: rgba(255, 255, 255, 0.08);
}
.MuiButton-root.Mui-disabled {
  color: rgba(255, 255, 255, 0.3);
}
@media (hover: none) {
  .MuiButton-root:hover {
    background-color: transparent;
  }
}
.MuiButton-root:hover.Mui-disabled {
  background-color: transparent;
}
.MuiButton-label {
  width: 100%;
  display: inherit;
  align-items: inherit;
  justify-content: inherit;
}
.MuiButton-text {
  padding: 6px 8px;
}
.MuiButton-textPrimary {
  color: #e90313;
}
.MuiButton-textPrimary:hover {
  background-color: rgba(233, 3, 19, 0.08);
}
@media (hover: none) {
  .MuiButton-textPrimary:hover {
    background-color: transparent;
  }
}
.MuiButton-textSecondary {
  color: #009e2a;
}
.MuiButton-textSecondary:hover {
  background-color: rgba(0, 158, 42, 0.08);
}
@media (hover: none) {
  .MuiButton-textSecondary:hover {
    background-color: transparent;
  }
}
.MuiButton-outlined {
  border: 1px solid rgba(255, 255, 255, 0.23);
  padding: 5px 15px;
}
.MuiButton-outlined.Mui-disabled {
  border: 1px solid rgba(255, 255, 255, 0.12);
}
.MuiButton-outlinedPrimary {
  color: #e90313;
  border: 1px solid rgba(233, 3, 19, 0.5);
}
.MuiButton-outlinedPrimary:hover {
  border: 1px solid #e90313;
  background-color: rgba(233, 3, 19, 0.08);
}
@media (hover: none) {
  .MuiButton-outlinedPrimary:hover {
    background-color: transparent;
  }
}
.MuiButton-outlinedSecondary {
  color: #009e2a;
  border: 1px solid rgba(0, 158, 42, 0.5);
}
.MuiButton-outlinedSecondary:hover {
  border: 1px solid #009e2a;
  background-color: rgba(0, 158, 42, 0.08);
}
.MuiButton-outlinedSecondary.Mui-disabled {
  border: 1px solid rgba(255, 255, 255, 0.3);
}
@media (hover: none) {
  .MuiButton-outlinedSecondary:hover {
    background-color: transparent;
  }
}
.MuiButton-contained {
  color: rgba(0, 0, 0, 0.87);
  box-shadow: 0px 3px 1px -2px rgba(0,0,0,0.2),0px 2px 2px 0px rgba(0,0,0,0.14),0px 1px 5px 0px rgba(0,0,0,0.12);
  background-color: #e0e0e0;
}
.MuiButton-contained:hover {
  box-shadow: 0px 2px 4px -1px rgba(0,0,0,0.2),0px 4px 5px 0px rgba(0,0,0,0.14),0px 1px 10px 0px rgba(0,0,0,0.12);
  background-color: #d5d5d5;
}
.MuiButton-contained.Mui-focusVisible {
  box-shadow: 0px 3px 5px -1px rgba(0,0,0,0.2),0px 6px 10px 0px rgba(0,0,0,0.14),0px 1px 18px 0px rgba(0,0,0,0.12);
}
.MuiButton-contained:active {
  box-shadow: 0px 5px 5px -3px rgba(0,0,0,0.2),0px 8px 10px 1px rgba(0,0,0,0.14),0px 3px 14px 2px rgba(0,0,0,0.12);
}
.MuiButton-contained.Mui-disabled {
  color: rgba(255, 255, 255, 0.3);
  box-shadow: none;
  background-color: rgba(255, 255, 255, 0.12);
}
@media (hover: none) {
  .MuiButton-contained:hover {
    box-shadow: 0px 3px 1px -2px rgba(0,0,0,0.2),0px 2px 2px 0px rgba(0,0,0,0.14),0px 1px 5px 0px rgba(0,0,0,0.12);
    background-color: #e0e0e0;
  }
}
.MuiButton-contained:hover.Mui-disabled {
  background-color: rgba(255, 255, 255, 0.12);
}
.MuiButton-containedPrimary {
  color: #fff;
  background-color: #e90313;
}
.MuiButton-containedPrimary:hover {
  background-color: #a3020d;
}
@media (hover: none) {
  .MuiButton-containedPrimary:hover {
    background-color: #e90313;
  }
}

.jss443 {
  min-width: 0;
}
.jss444 {
  min-width: 0;
}
.jss444 svg {
  font-size: 1rem;
}
.MuiButton-containedSecondary {
  color: #fff;
  background-color: #009e2a;
}
.MuiButton-containedSecondary:hover {
  background-color: #006e1d;
}
@media (hover: none) {
  .MuiButton-containedSecondary:hover {
    background-color: #009e2a;
  }
}
.MuiButton-disableElevation {
  box-shadow: none;
}
.MuiButton-disableElevation:hover {
  box-shadow: none;
}
.MuiButton-disableElevation.Mui-focusVisible {
  box-shadow: none;
}
.MuiButton-disableElevation:active {
  box-shadow: none;
}

.MuiIconButton-root {
  flex: 0 0 auto;
  color: #fff;
  padding: 12px;
  overflow: visible;
  font-size: 1.5rem;
  text-align: center;
  transition: background-color 150ms cubic-bezier(0.4, 0, 0.2, 1) 0ms;
  border-radius: 50%;
}
.MuiIconButton-root:hover {
  background-color: rgba(255, 255, 255, 0.08);
}
.MuiIconButton-root.Mui-disabled {
  color: rgba(255, 255, 255, 0.3);
  background-color: transparent;
}
@media (hover: none) {
  .MuiIconButton-root:hover {
    background-color: transparent;
  }
}
.MuiIconButton-edgeStart {
  margin-left: -12px;
}
.MuiIconButton-sizeSmall.MuiIconButton-edgeStart {
  margin-left: -3px;
}

.MuiTouchRipple-root {
  top: 0;
  left: 0;
  right: 0;
  bottom: 0;
  z-index: 0;
  overflow: hidden;
  position: absolute;
  border-radius: inherit;
  pointer-events: none;
}
.MuiTouchRipple-ripple {
  opacity: 0;
  position: absolute;
}
.MuiTouchRipple-rippleVisible {
  opacity: 0.3;
  animation: MuiTouchRipple-keyframes-enter 550ms cubic-bezier(0.4, 0, 0.2, 1);
  transform: scale(1);
}
.MuiTouchRipple-ripplePulsate {
  animation-duration: 200ms;
}
.MuiTouchRipple-child {
  width: 100%;
  height: 100%;
  display: block;
  opacity: 1;
  border-radius: 50%;
  background-color: currentColor;
}
.MuiTouchRipple-childLeaving {
  opacity: 0;
  animation: MuiTouchRipple-keyframes-exit 550ms cubic-bezier(0.4, 0, 0.2, 1);
}
.MuiTouchRipple-childPulsate {
  top: 0;
  left: 0;
  position: absolute;
  animation: MuiTouchRipple-keyframes-pulsate 2500ms cubic-bezier(0.4, 0, 0.2, 1) 200ms infinite;
}
@-webkit-keyframes MuiTouchRipple-keyframes-enter {
  0% {
    opacity: 0.1;
    transform: scale(0);
  }
  100% {
    opacity: 0.3;
    transform: scale(1);
  }
}
@-webkit-keyframes MuiTouchRipple-keyframes-exit {
  0% {
    opacity: 1;
  }
  100% {
    opacity: 0;
  }
}
@-webkit-keyframes MuiTouchRipple-keyframes-pulsate {
  0% {
    transform: scale(1);
  }
  50% {
    transform: scale(0.92);
  }
  100% {
    transform: scale(1);
  }
}
.MuiIconButton-edgeEnd {
  margin-right: -12px;
}
.MuiIconButton-sizeSmall.MuiIconButton-edgeEnd {
  margin-right: -3px;
}
.MuiIconButton-colorInherit {
  color: inherit;
}
.MuiIconButton-colorPrimary {
  color: #e90313;
}
.MuiIconButton-colorPrimary:hover {
  background-color: rgba(233, 3, 19, 0.08);
}
@media (hover: none) {
  .MuiIconButton-colorPrimary:hover {
    background-color: transparent;
  }
}
.MuiIconButton-colorSecondary {
  color: #009e2a;
}
.MuiIconButton-colorSecondary:hover {
  background-color: rgba(0, 158, 42, 0.08);
}
@media (hover: none) {
  .MuiIconButton-colorSecondary:hover {
    background-color: transparent;
  }
}
.MuiIconButton-sizeSmall {
  padding: 3px;
  font-size: 1.125rem;
}
.MuiIconButton-label {
  width: 100%;
  display: flex;
  align-items: inherit;
  justify-content: inherit;
}
.MuiButton-disableElevation.Mui-disabled {
  box-shadow: none;
}
.MuiButton-colorInherit {
  color: inherit;
  border-color: currentColor;
}
.MuiButton-textSizeSmall {
  padding: 4px 5px;
  font-size: 0.8125rem;
}
.MuiButton-textSizeLarge {
  padding: 8px 11px;
  font-size: 0.9375rem;
}
.MuiButton-outlinedSizeSmall {
  padding: 3px 9px;
  font-size: 0.8125rem;
}
.MuiButton-outlinedSizeLarge {
  padding: 7px 21px;
  font-size: 0.9375rem;
}

.MuiSvgIcon-root {
  fill: currentColor;
  width: 1em;
  height: 1em;
  display: inline-block;
  font-size: 1.5rem;
  transition: fill 200ms cubic-bezier(0.4, 0, 0.2, 1) 0ms;
  flex-shrink: 0;
  user-select: none;
}
.MuiSvgIcon-colorPrimary {
  color: #e90313;
}
.MuiSvgIcon-colorSecondary {
  color: #009e2a;
}
.MuiSvgIcon-colorAction {
  color: #fff;
}
.MuiSvgIcon-colorError {
  color: #f44336;
}
.MuiSvgIcon-colorDisabled {
  color: rgba(255, 255, 255, 0.3);
}
.MuiSvgIcon-fontSizeInherit {
  font-size: inherit;
}
.MuiSvgIcon-fontSizeSmall {
  font-size: 1.25rem;
}
.MuiSvgIcon-fontSizeLarge {
  font-size: 2.1875rem;
}
.MuiButton-containedSizeSmall {
  padding: 4px 10px;
  font-size: 0.8125rem;
}
.MuiButton-containedSizeLarge {
  padding: 8px 22px;
  font-size: 0.9375rem;
}
.MuiButton-fullWidth {
  width: 100%;
}
.MuiButton-startIcon {
  display: inherit;
  margin-left: -4px;
  margin-right: 8px;
}
.MuiButton-startIcon.MuiButton-iconSizeSmall {
  margin-left: -2px;
}
.MuiButton-endIcon {
  display: inherit;
  margin-left: 8px;
  margin-right: -4px;
}
.MuiButton-endIcon.MuiButton-iconSizeSmall {
  margin-right: -2px;
}
.MuiButton-iconSizeSmall > *:first-child {
  font-size: 18px;
}
.MuiButton-iconSizeMedium > *:first-child {
  font-size: 20px;
}
.MuiButton-iconSizeLarge > *:first-child {
  font-size: 22px;
}
</style>